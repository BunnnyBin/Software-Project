
public class PlayBowling {
	int [] rolls = new int [21];
	int currnetroll = 0; 
	
	//핀 횟수 배열
	public void rollarray(int pins) {
		rolls[currnetroll++] = pins;
	}
	//총점 구하는 함수
	public int getScore(int past_score, int currentframe) {
		int getscore = past_score;
		int i = currentframe * 2; //현재 횟수
		
		if(rolls[i] == 10 && rolls[i+2] != 10) {//원 스트라이크
			getscore += (10 + rolls[i+2] + rolls[i+3]);
		}
		else if(rolls[i] == 10 && rolls[i+2] == 10 && rolls[i+4] != 10) { //투 스트라이크
			getscore += (10 + 10 + rolls[i+4]);
		}
		else if(rolls[i] == 10 && rolls[i+2] == 10 && rolls[i+4] == 10) { //트리 스트라이크
			getscore += 10 * 3;
		}
		else if(rolls[i] + rolls[i+1] == 10) { //스트라이크가 아닌 스페어 처리
			getscore += (10 + rolls[i+2]);
		}
		else { //일반적인 경우
			getscore += (rolls[i] + rolls[i+1]);
		}
		return getscore;
	}
}
