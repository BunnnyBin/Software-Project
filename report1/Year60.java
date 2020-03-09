package Report01;

import java.util.Scanner;

public class Year60 {

	public static void main(String[] args) {
		String StringArray[] = {"갑자","을축","병인","정묘","무진","기사","경오","신미","임신","계유",
				"갑술","을해","병자","정축","무인","기묘","경진","신사","임오","계미",
				"갑신","을유","병술","정해","무자","기축","경인","신묘","임진","계사",
				"갑오","을미","병신","정유","무술","기해","경자","신축","임인","계묘",
				"갑진","을사","병오","정미","무신","기유","경술","신해","임자","계축",
				"갑인","을묘","병진","정사","무오","기미","경신","신유","임술","계해"};
		int i;
		
		System.out.print("년도를 입력하시오> ");
		Scanner a = new Scanner(System.in);
		int year = a.nextInt();
		
		i = (year - 1924) % 60;//해당 년이 60진법에서 몇번째에 있는지
		
		System.out.println(year + "년은 \"" + StringArray[i] + "\"년입니다.");
	
		a.close();
	}

}
