import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

class Mme {

  public static void main(String[] args) {

    Thread thread = new Thread(() -> {
      while (1 == 1) {
        try {
          SecretKey secretKey = KeyGenerator.getInstance("AES").generateKey();
          Cipher cipher = Cipher.getInstance("AES");
          cipher.init(Cipher.ENCRYPT_MODE, secretKey);
          cipher.doFinal("DOijqwofijoweoerggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggger43t23b hw54".getBytes());
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | BadPaddingException | IllegalBlockSizeException | InvalidKeyException e) {
          e.printStackTrace();
        }
      }
    });
    thread.setName("TEST THREAD");

    thread.start();


  }
}