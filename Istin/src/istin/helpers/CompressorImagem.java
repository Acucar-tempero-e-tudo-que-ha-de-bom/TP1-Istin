package istin.helpers;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

/**
 * Classe auxiliar utilizada pra "comprimir" imagens.
 */
public class CompressorImagem {
    /**
     * Reduz o tamanho de uma imagem para um tamanho específico.
     * @param imagem imagem a ser reduzida
     * @param largura largura desejada
     * @param altura altura desejada
     * @return imagem redimensionada
     */
    public static byte[] comprimir (byte[] imagem, int largura, int altura) {
        try {
            BufferedImage image = bytesToImage(imagem);
            Image imagemRedimensionada = image.getScaledInstance(largura, altura, Image.SCALE_FAST);
            BufferedImage saida = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);
            saida.getGraphics().drawImage(imagemRedimensionada, 0, 0, null);
            return imageToBytes(saida);
        } catch (IOException ex) {
            return new byte[0];
        }
    }
    
    /**
     * Transforma uma array de bytes em uma BufferedImage.
     * @param bytes array de bytes da imagem
     * @return BufferedImage
     * @throws IOException
     */
    public static BufferedImage bytesToImage (byte[] bytes) throws IOException {
        InputStream is = new ByteArrayInputStream(bytes);
        BufferedImage bi = ImageIO.read(is);
        return bi;
    }
    
    /**
     * Transforma uma BufferedImage em uma array de bytes.
     * @param image buffered image
     * @param format formato da imagem
     * @return array de bytes da imagem
     * @throws IOException
     */
    public static byte[] imageToBytes (BufferedImage image, String format) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, format, baos);
        byte[] bytes = baos.toByteArray();
        return bytes;
    }
    
    /**
     * Transforma uma BufferedImage em uma array de bytes.
     * @param image buffered image
     * @return array de bytes da imagem
     * @throws IOException
     */
    public static byte[] imageToBytes (BufferedImage image) throws IOException {
        return imageToBytes(image, "png");
    }
}
