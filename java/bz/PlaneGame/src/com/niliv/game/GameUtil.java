package com.niliv.game;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * 工具类
 * @author yuankun
 *
 */
public class GameUtil {
    // 工具类最好将构造器私有化。
    private GameUtil() {
     
    } 
 
    //获取图片对象
    public static Image getImage(String path) {
        BufferedImage bi = null;
        try {
            URL u = GameUtil.class.getClassLoader().getResource(path);
            bi = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bi;
    }
}
