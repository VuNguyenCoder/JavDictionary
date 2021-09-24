import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

class JavDictionary
{
	public static void main(String[] args)
	{
		try
		{
			Scanner scanner = new Scanner(System.in);
			Path path = Path.of("Data.txt");
			List<String> idol_data_list = Files.readAllLines(path);
			
			while(true)
			{
				System.out.print("Nhap idol muon tim kiem: ");
				String search = scanner.nextLine();
				System.out.format("%-15s %-5s %-10s %-10s %-15s\n",
						"HO TEN",
						"TUOI",
						"CHIEU CAO",
						"CAN NANG",
						"TINH TRANG");
				for(String idol_data : idol_data_list  )
				{
					String[] data = idol_data.split(";");
					Idol idol = new Idol();
					idol.ho_ten = data[0];
					idol.tuoi = Integer.valueOf(data[1]);
					idol.chieu_cao = Double.valueOf(data[2]);
					idol.can_nang = Double.valueOf(data[3]);
					
					if(idol.ho_ten.contains(search))
					{
						System.out.format("%-15s %-5s %-10s %-10s %-15s\n",
							idol.ho_ten,
							idol.tuoi,
							idol.chieu_cao,
							idol.can_nang,
							idol.tinh_trang_lao_dong());
					}
				}
				System.out.println("-----------------------------------\n");
			}
		}
		catch (IOException e){}
	}
}
