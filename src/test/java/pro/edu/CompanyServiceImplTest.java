package pro.edu;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/*
  @author   george
  @project   tdd
  @class  CompanyServiceImplTest
  @version  1.0.0 
  @since 01.02.23 - 11.55
*/

public class CompanyServiceImplTest {


    CompanyServiceImpl underTest = new CompanyServiceImpl();
    Company single = new Company(null, 5);
    Company root = new Company(null, 7);
    Company accounting = new Company(root, 3);
    Company development = new Company(root, 11);
    Company frontEnd = new Company(development, 5);
    Company graphDesign = new Company(frontEnd, 3);
    Company backend = new Company(development, 3);
    Company bd = new Company(development, 3);
    Company devops = new Company(development, 3);



    @Test
    public void whenCompanyIsSingleThenParentisTheSameCompany() {
        Company rezult = underTest.getTopLevelParent(single);
        assertTrue(rezult.equals(single));
    }

    @Test
    public void whenCompanyIsRootThenParentisTheSameCompany() {
        Company rezult = underTest.getTopLevelParent(root);
        assertTrue(rezult.equals(root));
    }
    @Test
    public void whenCompanyInChainBottomThenTopIsCompanyWithParentNull() {
        Company rezult = underTest.getTopLevelParent(accounting);
        assertTrue(rezult.equals(root));
    }
    @Test
    public void whenCompanyInChainLowBottomThenTopIsCompanyWithParentNull() {
        Company rezult = underTest.getTopLevelParent(graphDesign);
        assertTrue(rezult.equals(root));
    }


    @Test
    public void getEmployeeCountForCompanyAndChildren() {
    }
}
