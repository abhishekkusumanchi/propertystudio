# propertystudiolatest

Documentation: Integrating SendingMail Class for Email Notifications
To ensure your class can send various types of emails such as OTP verification, payment verification, and password updates, you need to integrate the SendingMail class. Below are the detailed steps and method usage for incorporating this functionality.

Step-by-Step Integration
Declare an instance of SendingMail in your class.
Use dependency injection to set the SendingMail instance.

eg: 

public class Demo {
    
    // Step 1: Declare the SendingMail instance
    private SendingMail sendMail;

    // Step 2: Use @Autowired to inject the SendingMail dependency
    @Autowired
    public void setSendingMail(SendingMail mail) {
        this.sendMail = mail;
    }
}


//methods in SendingMail
The SendingMail class provides three main methods for sending different types of emails. Below are the method signatures and their descriptions.

1. OTP Verification

Copy code
	public void sendOtpVerifcation(String email, String subject, String data)
Parameters:

email: The recipient's email address.
subject: The subject of the email.
data: The content of the email, typically including the OTP code.
Usage Example:

Copy code
sendMail.sendOtpVerifcation("user@example.com", "Your OTP Code", "Your OTP code is 123456");

2. Payment Verification

public void paymentVerification(String email, String subject, String name, String amount, String orderId, String paymentId)
Parameters:

email: The recipient's email address.
subject: The subject of the email.
name: The recipient's name.
amount: The payment amount.
orderId: The order ID associated with the payment.
paymentId: The payment ID associated with the transaction.


Usage Example:
sendMail.paymentVerification("user@example.com", "Payment Confirmation", "John Doe", "$100.00", "ORD12345", "PAY67890");


3. Password Update
public void passwordUpdate(String email, String subject, String name)

Parameters:
email: The recipient's email address.
subject: The subject of the email.
name: The recipient's name.
Usage Example:

java
Copy code
sendMail.passwordUpdate("user@example.com", "Password Update Notification", "John Doe");

