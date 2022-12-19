package LayerDemo.Business.Concretes;

import java.util.List;

import LayerDemo.Business.Abstract.ICampaignService;
import LayerDemo.DataAccess.Abstract.ICampaignDao;
import LayerDemo.Entities.Concretes.Campaign;

public class CampaignManager implements ICampaignService {
	ICampaignDao campaignDao;
	

	public CampaignManager(ICampaignDao campaignDao) {
		
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		campaignDao.add(campaign);
		
	}

	@Override
	public void update(Campaign campaign, int id) {
		campaignDao.update(campaign, id);
		
	}

	@Override
	public void delete(int id) {
		campaignDao.delete(id);
		
	}

	@Override
	public List<Campaign> get() {
		
		return null;
	}

}
