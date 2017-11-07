package org.ppke.itk.hj.util;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("passwordValidator")
public class PasswordValidator implements Validator{

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		UIInput input = (UIInput)component;
		String password = (String) value;
		
		if(value == null || value.equals("")) {
			input.setValid(false);
			context.addMessage(
					component.getClientId(context), 
					new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"ERROR",
							"The value must not be null"));
		}else if(password.length()<6 || password.length()>12) {
			input.setValid(false);
			context.addMessage(
					component.getClientId(context), 
					new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"ERROR",
							"Password length must be between 6 and 12 characters"));
		}
		
	}

	

}
