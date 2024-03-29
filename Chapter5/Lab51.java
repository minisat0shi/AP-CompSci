public class Lab51 {
	public static Comparable[] merge(Comparable[] a, Comparable[] b) {

		Comparable[] answer = new Comparable[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length)
		{
			if (a[i] < b[j])
			{
				answer[k] = a[i];
				i++;
			}
			else
			{
				answer[k] = b[j];
				j++;
			}
			k++;
		}

		while (i < a.length)
		{
			answer[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length)
		{
			answer[k] = b[j];
			j++;
			k++;
		}

		return answer;
	}
}

