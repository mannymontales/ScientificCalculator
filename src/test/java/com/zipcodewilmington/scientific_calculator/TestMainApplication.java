package com.zipcodewilmington.scientific_calculator;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CoreTest.class,
        ScientificTest.class,
})
public class TestMainApplication {


}
