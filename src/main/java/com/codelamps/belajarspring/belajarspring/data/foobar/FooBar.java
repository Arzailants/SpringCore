package com.codelamps.belajarspring.belajarspring.data.foobar;

import com.codelamps.belajarspring.belajarspring.data.foobar.Bar;
import com.codelamps.belajarspring.belajarspring.data.foobar.Foo;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FooBar {

    private Foo foo;

    private Bar bar;
}
