    package com.training;

    import org.testng.Assert;
    import org.testng.annotations.Test;

    /**
     * Created by anastasiyam on 1/29/2017.
     */
        public class FirstTest {
        @Test
            public void testArea(){

                Square s=new Square(5);
                Assert.assertEquals(s.area(),25.0);
            }

        @Test
        public void testDistance1(){
        Point p=new Point(2,4,2,6);
                Assert.assertEquals(p.calculateDistance(),4.0);

            }

        @Test
        public void testDistance2(){
            Point p=new Point(2,10,2,50);
            Assert.assertEquals(p.calculateDistance(),49.0);

        }
        }
