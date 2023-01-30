
package alıstırma;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Alıstırma {

    
    public static void main(String[] args) {
                // envanter nesnelerini depolamak için ArrayList oluştur
		List<Inventory> invItem = new ArrayList<>();
		try
		{
                        // FileReader ile bir Buffered Reader nesne örneği oluşturun
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rabia\\Desktop\\inventory.txt"));

			// metin dosyasındaki ilk satırı oku
			String fileRead = br.readLine();

			// tüm satırlar okunana kadar döngü
			while (fileRead != null)
			{

				// dizenin her satırındaki değerlerle bir dize dizisi yüklemek için string.split'i kullanın
                                // dosya, sınırlayıcı olarak virgül kullanarak
				String[] tokenize = fileRead.split(",");

				// dosyanın doğru yapıldığını varsayalım
// ve üç veri türü için geçici değişkenler oluşturun
				String tempItem = tokenize[0];
				int tempQty = Integer.parseInt(tokenize[1]);
				float tempPrice = Float.parseFloat(tokenize[2]);

				// Envanter nesnesinin geçici örneğini oluştur
// ve üç veri değeriyle yükle
				Inventory tempObj = new Inventory(tempItem, tempQty, tempPrice);

				// dizi listesine ekle
				invItem.add(tempObj);

				// döngüden önce sonraki satırı oku
// dosyanın sonuna ulaşıldıysa 
				fileRead = br.readLine();
			}

			// dosya akışını kapat
			br.close();
		}
		
		// istisnaları ele al
		catch (FileNotFoundException fnfe)
		{
			System.out.println("file not found");
		}

		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}

		// display inventory
		for (Inventory each : invItem)
		{
			System.out.println("====================");
			System.out.println(each);
			System.out.println();
			System.out.printf("Total value = %8.2f %n", each.getTotal());
		}

    }
    
}
