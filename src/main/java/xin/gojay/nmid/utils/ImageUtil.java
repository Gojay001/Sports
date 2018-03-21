package xin.gojay.nmid.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author Gojay
 * @date 2018/3/6
 */
public class ImageUtil {
    private static final String GIF = ".GIF";
    private static final String PNG = ".PNG";
    private static final String JPG = ".JPG";

    public static String saveImage(MultipartFile file, HttpServletRequest request) {
        if (file == null) {
            return null;
        }
        String path = request.getSession().getServletContext().getRealPath("upload/images");
        /// 查看图片存储路径
        // System.out.println(request.getSession().getServletContext().getRealPath("upload/images"));

        if (!new File(path).exists() || !new File(path).isDirectory()) {
            if (!new File(path).mkdirs()) {
                return null;
            }
        }
        // 获取上传文件的文件名
        String name = file.getOriginalFilename();
        String type = name.substring(name.lastIndexOf("."), name.length());
        if (!(GIF.equals(type.toUpperCase()) || PNG.equals(type.toUpperCase()) || JPG.equals(type.toUpperCase()))) {
            return null;
        }
        // 储存文件名
        name = TimeUtil.getNowDate() + "_" + Math.random() + type.toUpperCase();
        File image = new File(path, name);
        try {
            file.transferTo(image);
        } catch (IOException e) {
            System.out.println("上传文件出错！");
            return null;
        }
        return name;
    }

    public static int deleteImage(String name, HttpServletRequest request) {
        if (name == null || "".equals(name)) {
            return 0;
        }
        String path = request.getSession().getServletContext().getRealPath("upload/images");
        File image = new File(path, name);
        if (!image.isFile() || !image.exists()) {
            return 0;
        }
        if (!image.delete()){
            return 0;
        }
        return 1;
    }
}
