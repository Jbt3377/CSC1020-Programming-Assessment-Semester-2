package part01;

public enum Pathway {
	
	CIT {
		@Override
		public String description() {
			return "Computing and Information Technology";
		}
	}, BIT {
		@Override
		public String description() {
			return "Business Information Technology";
		}
	}, CS {
		@Override
		public String description() {
			return "Computer Science";
		}
	}, SE {
		@Override
		public String description() {
			return "Software Engineering";
		}
	};
	
	public abstract String description();

}
