package com.oberdan.livraria.exception;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class LivrariaException extends RuntimeException {

}
