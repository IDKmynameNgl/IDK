public static String  showMessageInfo (int contactNumber){
		Scanner in = new Scanner(System.in);
		String userInput = "a";
		Contact contact1 = new Contact();
		Contact contact2 = new Contact();
		Contact contact3 = new Contact();
		Contact contact4 = new Contact();
		Message contact1M = new Message();
		Message contact2M = new Message();
		Message contact3M = new Message();
		Message contact4M = new Message();
		if (contactNumber == 1 ){
			System.out.println("Message from:" + contact1.getFirstName());
			System.out.println(contact1M.getDay() + " " + contact1M.getTime());
			contact1M.getMessage();
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			userInput = in.next();
			if (userInput == "y"){
				System.out.println(showPhoneNumber(contactNumber));
			}
		}
		if (contactNumber == 2 ){
			System.out.println("Message from:" + contact2.getFirstName());
			System.out.println(contact2M.getDay() + " "+ contact2M.getTime());
			System.out.println(contact2M.getMessage());
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			userInput = in.next();
			if (userInput == "y"){
				System.out.println(showPhoneNumber(contactNumber));
			}
		}
		if (contactNumber == 3 ){
			System.out.println("Message from:" + contact3.getFirstName());
			System.out.println(contact3M.getDay() + " " +contact3M.getTime());
			System.out.println(contact3M.getMessage());
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			userInput = in.next();
			if (userInput == "y"){
				System.out.println(showPhoneNumber(contactNumber));
			}else{

			}
		}
		if (contactNumber == 4){
			System.out.println("Message from:" + contact4.getFirstName());
			System.out.println(contact4M.getDay() + " " + contact4M.getTime());
			System.out.println(contact4M.getMessage());
			System.out.println("Would you like to view the phone number? [y] Yes, [n] No");
			userInput = in.next();
			if (userInput == "y"){
				System.out.println(showPhoneNumber(contactNumber));
			}
		}
	}
	
	/* The method, showPhoneNumber, returns phone number of the specific Contact the user chose. */
	public static int showPhoneNumber(int contactNumber){
		Contact contact1 = new Contact();
		Contact contact2 = new Contact();
		Contact contact3 = new Contact();
		Contact contact4 = new Contact();
		Message contact1M = new Message();
		Message contact2M = new Message();
		Message contact3M = new Message();
		Message contact4M = new Message();
		if (contactNumber == 1 ){
			System.out.println(contact1.getNumber());
		}
		if (contactNumber == 2 ){
			System.out.println(contact2.getNumber());
		}
		if (contactNumber == 3 ){
			System.out.println(contact3.getNumber());
		}
		if (contactNumber == 4){
			System.out.println(contact4.getNumber());
		}