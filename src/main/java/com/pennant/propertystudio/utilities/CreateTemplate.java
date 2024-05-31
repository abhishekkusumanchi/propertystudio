package com.pennant.propertystudio.utilities;

import org.springframework.stereotype.Component;

@Component
public class CreateTemplate{
	
	public String emailVerification(String otp) {
		String emailVerificationString = "<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n" + "    <title>OTP Verification Email</title>\r\n"
				+ "    <style>\r\n" + "        body {\r\n" + "            background-color: #ffffff;\r\n"
				+ "            font-family: Arial, sans-serif;\r\n" + "            font-size: 16px;\r\n"
				+ "            line-height: 1.4;\r\n" + "            color: #333333;\r\n" + "            margin: 0;\r\n"
				+ "            padding: 0;\r\n" + "        }\r\n" + "\r\n" + "        .container {\r\n"
				+ "            max-width: 600px;\r\n" + "            margin: 0 auto;\r\n"
				+ "            padding: 20px;\r\n" + "            text-align: center;\r\n" + "        }\r\n" + "\r\n"
				+ "        .logo {\r\n" + "            max-width: 200px;\r\n" + "            margin-bottom: 20px;\r\n"
				+ "        }\r\n" + "\r\n" + "        .message {\r\n" + "            font-size: 18px;\r\n"
				+ "            font-weight: bold;\r\n" + "            margin-bottom: 20px;\r\n" + "        }\r\n"
				+ "\r\n" + "        .body {\r\n" + "            font-size: 16px;\r\n"
				+ "            margin-bottom: 20px;\r\n" + "        }\r\n" + "\r\n" + "        .cta {\r\n"
				+ "            display: inline-block;\r\n" + "            padding: 10px 20px;\r\n"
				+ "            background-color: #FFD60A;\r\n" + "            color: #000000;\r\n"
				+ "            text-decoration: none;\r\n" + "            border-radius: 5px;\r\n"
				+ "            font-size: 16px;\r\n" + "            font-weight: bold;\r\n"
				+ "            margin-top: 20px;\r\n" + "        }\r\n" + "\r\n" + "        .support {\r\n"
				+ "            font-size: 14px;\r\n" + "            color: #999999;\r\n"
				+ "            margin-top: 20px;\r\n" + "        }\r\n" + "\r\n" + "        .highlight {\r\n"
				+ "            font-weight: bold;\r\n" + "        }\r\n" + "    </style>\r\n" + "\r\n" + "</head>\r\n"
				+ "\r\n" + "<body>\r\n" + "    <div class=\"container\">\r\n"
				+ "        <a href=\"https://property studio-edtech-project.vercel.app\"><img class=\"logo\"\r\n"
				+ "                src=\"https://pulsebay.co.nz/static/realestate_experts_main_banner-3b8686b3c91e563e54e1a8eeedf3561d.webp\" alt=\"property studio Logo\"></a>\r\n"
				+ "        <div class=\"message\">OTP Verification Email</div>\r\n" + "        <div class=\"body\">\r\n"
				+ "            <p>Dear User,</p>\r\n"
				+ "            <p>Thank you for registering with property studio. To complete your registration, please use the following OTP\r\n"
				+ "                (One-Time Password) to verify your account:</p>\r\n"
				+ "            <h2 class=\"highlight\">%s</h2>\r\n" // Use %s as a placeholder for the OTP
				+ "            <p>This OTP is valid for 5 minutes. If you did not request this verification, please disregard this email.\r\n"
				+ "            Once your account is verified, you will have access to our platform and its features.</p>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"support\">If you have any questions or need assistance, please feel free to reach out to us at <a\r\n"
				+ "                href=\"mailto:info@.com\">info@property studio.com</a>. We are here to help!</div>\r\n"
				+ "    </div>\r\n" + "</body>\r\n" + "\r\n" + "</html>";

		return String.format(emailVerificationString, otp);
	}

	public String paymentConfirmation(String name, String amount, String orderId, String paymentId) {
		String paymentConfirmationString = "<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n" + "    <title>Payment Confirmation</title>\r\n" + "    <style>\r\n"
				+ "        body {\r\n" + "            background-color: #ffffff;\r\n"
				+ "            font-family: Arial, sans-serif;\r\n" + "            font-size: 16px;\r\n"
				+ "            line-height: 1.4;\r\n" + "            color: #333333;\r\n" + "            margin: 0;\r\n"
				+ "            padding: 0;\r\n" + "        }\r\n" + "\r\n" + "        .container {\r\n"
				+ "            max-width: 600px;\r\n" + "            margin: 0 auto;\r\n"
				+ "            padding: 20px;\r\n" + "            text-align: center;\r\n" + "        }\r\n" + "\r\n"
				+ "        .logo {\r\n" + "            max-width: 200px;\r\n" + "            margin-bottom: 20px;\r\n"
				+ "        }\r\n" + "\r\n" + "        .message {\r\n" + "            font-size: 18px;\r\n"
				+ "            font-weight: bold;\r\n" + "            margin-bottom: 20px;\r\n" + "        }\r\n"
				+ "\r\n" + "        .body {\r\n" + "            font-size: 16px;\r\n"
				+ "            margin-bottom: 20px;\r\n" + "        }\r\n" + "\r\n" + "        .cta {\r\n"
				+ "            display: inline-block;\r\n" + "            padding: 10px 20px;\r\n"
				+ "            background-color: #FFD60A;\r\n" + "            color: #000000;\r\n"
				+ "            text-decoration: none;\r\n" + "            border-radius: 5px;\r\n"
				+ "            font-size: 16px;\r\n" + "            font-weight: bold;\r\n"
				+ "            margin-top: 20px;\r\n" + "        }\r\n" + "\r\n" + "        .support {\r\n"
				+ "            font-size: 14px;\r\n" + "            color: #999999;\r\n"
				+ "            margin-top: 20px;\r\n" + "        }\r\n" + "\r\n" + "        .highlight {\r\n"
				+ "            font-weight: bold;\r\n" + "        }\r\n" + "    </style>\r\n" + "\r\n" + "</head>\r\n"
				+ "\r\n" + "<body>\r\n" + "    <div class=\"container\">\r\n"
				+ "        <a href=\"https://property studio-edtech-project.vercel.app\"><img class=\"logo\" src=\"https://pulsebay.co.nz/static/realestate_experts_main_banner-3b8686b3c91e563e54e1a8eeedf3561d.webp\"\r\n"
				+ "                alt=\"property studio Logo\"></a>\r\n"
				+ "        <div class=\"message\">Course Payment Confirmation</div>\r\n"
				+ "        <div class=\"body\">\r\n" + "            <p>Dear %s,</p>\r\n"
				+ "            <p>We have received a payment of <span class='highlight'>₹%s</span></p>.\r\n"
				+ "            <p>Your Payment ID is <b>%s</b></p>\r\n"
				+ "            <p>Your Order ID is <b>%s</b></p>\r\n" + "        </div>\r\n"
				+ "        <div class=\"support\">If you have any questions or need assistance, please feel free to reach out to us at <a\r\n"
				+ "                href=\"mailto:info@property studio.com\">info@property studio.com</a>. We are here to help!</div>\r\n"
				+ "    </div>\r\n" + "</body>\r\n" + "\r\n" + "</html>";

		return String.format(paymentConfirmationString, name, amount, paymentId, orderId);
	}
	
	public String passwordUpdateConfirmation(String name, String email) {
		String passwordUpdateString = "<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n" + "    <title>Password Update Confirmation</title>\r\n"
				+ "    <style>\r\n" + "        body {\r\n" + "            background-color: #ffffff;\r\n"
				+ "            font-family: Arial, sans-serif;\r\n" + "            font-size: 16px;\r\n"
				+ "            line-height: 1.4;\r\n" + "            color: #333333;\r\n" + "            margin: 0;\r\n"
				+ "            padding: 0;\r\n" + "        }\r\n" + "        .container {\r\n"
				+ "            max-width: 600px;\r\n" + "            margin: 0 auto;\r\n"
				+ "            padding: 20px;\r\n" + "            text-align: center;\r\n" + "        }\r\n"
				+ "        .logo {\r\n" + "            max-width: 200px;\r\n" + "            margin-bottom: 20px;\r\n"
				+ "        }\r\n" + "        .message {\r\n" + "            font-size: 18px;\r\n"
				+ "            font-weight: bold;\r\n" + "            margin-bottom: 20px;\r\n" + "        }\r\n"
				+ "        .body {\r\n" + "            font-size: 16px;\r\n" + "            margin-bottom: 20px;\r\n"
				+ "        }\r\n" + "        .support {\r\n" + "            font-size: 14px;\r\n"
				+ "            color: #999999;\r\n" + "            margin-top: 20px;\r\n" + "        }\r\n"
				+ "        .highlight {\r\n" + "            font-weight: bold;\r\n" + "        }\r\n"
				+ "    </style>\r\n" + "</head>\r\n" + "\r\n" + "<body>\r\n" + "    <div class=\"container\">\r\n"
				+ "        <a href=\"https://property studio-edtech-project.vercel.app\"><img class=\"logo\"\r\n"
				+ "                src=\"https://pulsebay.co.nz/static/realestate_experts_main_banner-3b8686b3c91e563e54e1a8eeedf3561d.webp\" alt=\"property studio Logo\"></a>\r\n"
				+ "        <div class=\"message\">Password Update Confirmation</div>\r\n"
				+ "        <div class=\"body\">\r\n" + "            <p>Hey " + name + ",</p>\r\n"
				+ "            <p>Your password has been successfully updated for the email <span class=\"highlight\">"
				+ email + "</span>.</p>\r\n"
				+ "            <p>If you did not request this password change, please contact us immediately to secure your account.</p>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"support\">If you have any questions or need further assistance, please feel free to reach out to us at\r\n"
				+ "            <a href=\"mailto:info@property studio.com\">info@property studio.com</a>. We are here to help!\r\n"
				+ "        </div>\r\n" + "    </div>\r\n" + "</body>\r\n" + "\r\n" + "</html>";
		return passwordUpdateString;
	}
}
