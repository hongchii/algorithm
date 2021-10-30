package sort;

public class SelectionSort_Ex01 {

	public static void main(String[] args) {
		// 선택 정렬 - 이.코.테 p.159
		// 원소 중의 가장 작은 데이터를 선택해 맨 앞의 데이터와 바꾸고, 그 다음 작은 데이터와 바꾸고.. 반복해서 하는 정렬 작업.

		int n = 10;
		int arr[] = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		for (int i = 0; i < n; i++) { // arr.length == 10
			int min = i; // 가장 작은 데이터를 판별할 변수, 처음엔 i(0)을 넣어줌.
			for (int j = i + 1; j < n; j++) { // int j = 1
				if (arr[min] > arr[j]) { // arr[0]과 arr[1]의 원소를 비교한다.
					min = j; // arr[1]의 원소가 arr[0]보다 작으면 min(0)을 j(1)로 바꾼다.
					// 가장 작은 원소가 담겨있는 위치를 찾기위해 min을 인덱스 값으로 사용한다.
				}
			}
			// 스와프
			int temp = arr[i]; // 빈 공간에 현재 i의 원소를 넣어준다. (처음엔 i가 0부터 시작해서 첫번째 인덱스가 빈 상태가 됨.
			arr[i] = arr[min]; // 가장 작은 원소를 비어있는 i인덱스로 넣는다.
			arr[min] = temp; // min인덱스에 temp에 담아둔 원소를 넣는다.
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
