public static void main(String[] args) {
	int[] initialArr = new int[]{3, 5, 8, 2 ,1, 9, 0};
	int[] reverseArr = new int[initialArr.length];
	for (int i = 0; i < initialArr.length; i++) {
		reverseArr[i] = initialArr[initialArr.length - (i + 1)];
	}
	for (int i : reverseArr) {
		System.out.println(i);
	}
}
