package sort;

public class InsertionSort_Ex01 {

	public static void main(String[] args) {
		// 삽입 정렬 - 이.코.테 p.164
		// 첫 번째 데이터는 그 자체로 정렬이 되어있다고 판단하기 때문에 두 번째 데이터부터 시작한다.
		int n = 10;
		int arr[] = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		for (int i = 1; i < n; i++) { // 두 번째 데이터부터 시작하기 때문에 i = 1이다.
			for (int j = i; j > 0; j--) { // j = i , j가 1칸씩 감소하며 비교한다. (왼쪽으로 이동하며 비교)
				if (arr[j] < arr[j - 1]) { // 선택 정렬과 다르게 값 자체를 비교한다.
					// 스와프(Swap)
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
				// 자기보다 작은 데이터를 만나면 그 위치에서 멈춤
				else
					break;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
