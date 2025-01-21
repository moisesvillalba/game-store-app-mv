package org.mavs.gamestore.annotations;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Getter
@Setter
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface CustomData {
}
