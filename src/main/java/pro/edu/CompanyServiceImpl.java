package pro.edu;/*
  @author   george
  @project   tdd
  @class  pro.edu.CompanyServiceImpl
  @version  1.0.0 
  @since 01.02.23 - 11.51
*/

import pro.edu.Company;
import pro.edu.ICompanyService;

import java.util.List;

public class CompanyServiceImpl implements ICompanyService {
    @Override
    public Company getTopLevelParent(Company child) {
        Company rezult = child;
        if (child.getParent() != null) {
            rezult = this.getTopLevelParent(child.getParent());
        }
        return rezult;
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        return 0;
    }
}
