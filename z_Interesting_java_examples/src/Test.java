public class Test
	{
		public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

		private int num;
		private String data;

		
		public Test(int num, String data) {
			super();
			this.num = num;
			this.data = data;
		}

		public boolean equals(Object obj)
		{
			if(this == obj)
				return true;
			if((obj == null) || (obj.getClass() != this.getClass()))
				return false;
			// object must be Test at this point
			Test test = (Test)obj;
			return num == test.num &&
			(data == test.data || (data != null && data.equals(test.data)));
		}

//		public int hashCode()
//		{
//			int hash = 7;
//			hash = 31 * hash + num;
//			hash = 31 * hash + (null == data ? 0 : data.hashCode());
//			return hash;
//		}

	}