package com.in9midia.studio.data.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;

import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import com.in9midia.studio.data.entity.*;
import com.in9midia.studio.data.business.*;

/**
 * Controller para expor serviços REST de Company
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/Company")
public class CompanyREST {

	@Autowired
	private HttpServletRequest request;
	/**
	 * Classe de negócio para manipulação de dados
	 * 
	 * @generated
	 */
	@Autowired
	@Qualifier("CompanyBusiness")
	private CompanyBusiness companyBusiness;

	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("FolderBusiness")
	private FolderBusiness folderBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("AddressBusiness")
	private AddressBusiness addressBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("NeonewsUserBusiness")
	private NeonewsUserBusiness neonewsUserBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("AccountBusiness")
	private AccountBusiness accountBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("AgencyBusiness")
	private AgencyBusiness agencyBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("CampaignBusiness")
	private CampaignBusiness campaignBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("CampaignCategoryBusiness")
	private CampaignCategoryBusiness campaignCategoryBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("CategoryBusiness")
	private CategoryBusiness categoryBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("ChannelTypeBusiness")
	private ChannelTypeBusiness channelTypeBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("CommissionedBusiness")
	private CommissionedBusiness commissionedBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("FileBusiness")
	private FileBusiness fileBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("ParticipantBusiness")
	private ParticipantBusiness participantBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("PatrimonyBusiness")
	private PatrimonyBusiness patrimonyBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("PersonBusiness")
	private PersonBusiness personBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("ProfileBusiness")
	private ProfileBusiness profileBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("RegionBusiness")
	private RegionBusiness regionBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("RouteBusiness")
	private RouteBusiness routeBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("ScheduleBusiness")
	private ScheduleBusiness scheduleBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("SgaBusiness")
	private SgaBusiness sgaBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("CampaignTemplateBusiness")
	private CampaignTemplateBusiness campaignTemplateBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("TemplateBusiness")
	private TemplateBusiness templateBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("TerminalBusiness")
	private TerminalBusiness terminalBusiness;
	/**
	 * @generated
	 */
	@Autowired
	@Qualifier("UserCompanyBusiness")
	private UserCompanyBusiness userCompanyBusiness;

	/**
	 * Serviço exposto para novo registro de acordo com a entidade fornecida
	 * 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.POST)
	public Company post(@Validated @RequestBody final Company entity) throws Exception {
		companyBusiness.post(entity);
		return entity;
	}

	/**
	 * Serviço exposto para recuperar a entidade de acordo com o id fornecido
	 * 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
		Company entity = companyBusiness.get(id);
		return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
	}

	/**
	 * Serviço exposto para salvar alterações de acordo com a entidade fornecida
	 * 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<?> put(@Validated @RequestBody final Company entity) throws Exception {
		return ResponseEntity.ok(companyBusiness.put(entity));
	}

	/**
	 * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
	 * 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public Company put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Company entity)
			throws Exception {
		return companyBusiness.put(entity);
	}

	/**
	 * Serviço exposto para remover a entidade de acordo com o id fornecido
	 * 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void delete(@PathVariable("id") java.lang.String id) throws Exception {
		companyBusiness.delete(id);
	}

	/**
	 * NamedQuery list
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<Company> listParams(@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.list(new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Account")
	public List<Account> findAccount(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findAccount(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Account/{relationId}")
	public ResponseEntity<?> deleteAccount(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.accountBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Agency")
	public List<Agency> findAgency(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findAgency(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Agency/{relationId}")
	public ResponseEntity<?> deleteAgency(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.agencyBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Campaign")
	public List<Campaign> findCampaign(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findCampaign(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Campaign/{relationId}")
	public ResponseEntity<?> deleteCampaign(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.campaignBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/CampaignCategory")
	public List<CampaignCategory> findCampaignCategory(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findCampaignCategory(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/CampaignCategory/{relationId}")
	public ResponseEntity<?> deleteCampaignCategory(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.campaignCategoryBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Category")
	public List<Category> findCategory(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findCategory(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Category/{relationId}")
	public ResponseEntity<?> deleteCategory(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.categoryBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/ChannelType")
	public List<ChannelType> findChannelType(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findChannelType(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/ChannelType/{relationId}")
	public ResponseEntity<?> deleteChannelType(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.channelTypeBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Commissioned")
	public List<Commissioned> findCommissioned(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findCommissioned(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Commissioned/{relationId}")
	public ResponseEntity<?> deleteCommissioned(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.commissionedBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/File")
	public List<File> findFile(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findFile(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/File/{relationId}")
	public ResponseEntity<?> deleteFile(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.fileBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Folder_2")
	public List<Folder> findFolder_2(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findFolder_2(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Folder_2/{relationId}")
	public ResponseEntity<?> deleteFolder_2(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.folderBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Participant")
	public List<Participant> findParticipant(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findParticipant(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Participant/{relationId}")
	public ResponseEntity<?> deleteParticipant(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.participantBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Patrimony")
	public List<Patrimony> findPatrimony(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findPatrimony(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Patrimony/{relationId}")
	public ResponseEntity<?> deletePatrimony(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.patrimonyBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Patrimony_2")
	public List<Patrimony> findPatrimony_2(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findPatrimony_2(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Patrimony_2/{relationId}")
	public ResponseEntity<?> deletePatrimony_2(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.patrimonyBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Patrimony_3")
	public List<Patrimony> findPatrimony_3(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findPatrimony_3(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Patrimony_3/{relationId}")
	public ResponseEntity<?> deletePatrimony_3(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.patrimonyBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Patrimony_4")
	public List<Patrimony> findPatrimony_4(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findPatrimony_4(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Patrimony_4/{relationId}")
	public ResponseEntity<?> deletePatrimony_4(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.patrimonyBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Person")
	public List<Person> findPerson(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findPerson(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Person/{relationId}")
	public ResponseEntity<?> deletePerson(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.personBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Profile")
	public List<Profile> findProfile(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findProfile(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Profile/{relationId}")
	public ResponseEntity<?> deleteProfile(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.profileBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Region")
	public List<Region> findRegion(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findRegion(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Region/{relationId}")
	public ResponseEntity<?> deleteRegion(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.regionBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Route")
	public List<Route> findRoute(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findRoute(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Route/{relationId}")
	public ResponseEntity<?> deleteRoute(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.routeBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Schedule")
	public List<Schedule> findSchedule(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findSchedule(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Schedule/{relationId}")
	public ResponseEntity<?> deleteSchedule(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.scheduleBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Sga")
	public List<Sga> findSga(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findSga(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Sga/{relationId}")
	public ResponseEntity<?> deleteSga(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.sgaBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/CampaignTemplate")
	public List<CampaignTemplate> findCampaignTemplate(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findCampaignTemplate(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/CampaignTemplate/{relationId}")
	public ResponseEntity<?> deleteCampaignTemplate(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.campaignTemplateBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Template")
	public List<Template> findTemplate(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findTemplate(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Template/{relationId}")
	public ResponseEntity<?> deleteTemplate(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.templateBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Terminal")
	public List<Terminal> findTerminal(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findTerminal(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Terminal/{relationId}")
	public ResponseEntity<?> deleteTerminal(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.terminalBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/NeonewsUser")
	public List<NeonewsUser> findNeonewsUser(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findNeonewsUser(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/NeonewsUser/{relationId}")
	public ResponseEntity<?> deleteNeonewsUser(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.neonewsUserBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * OneToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/UserCompany")
	public List<UserCompany> findUserCompany(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.findUserCompany(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * OneToMany Relationship DELETE 
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/UserCompany/{relationId}")
	public ResponseEntity<?> deleteUserCompany(@PathVariable("relationId") java.lang.String relationId) {
		try {
			this.userCompanyBusiness.delete(relationId);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}

	/**
	 * ManyToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Folder")
	public List<Folder> listFolder(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.listFolder(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * ManyToMany Relationship POST
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/{instanceId}/Folder")
	public ResponseEntity<?> postFolder(@Validated @RequestBody final Folder entity,
			@PathVariable("instanceId") java.lang.String instanceId) throws Exception {
		File newFile = new File();

		Company instance = this.companyBusiness.get(instanceId);

		newFile.setFolder(entity);
		newFile.setCompany(instance);

		this.fileBusiness.post(newFile);

		return ResponseEntity.ok(newFile.getCompany());
	}

	/**
	 * ManyToMany Relationship DELETE
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Folder/{relationId}")
	public ResponseEntity<?> deleteFolder(@PathVariable("instanceId") java.lang.String instanceId,
			@PathVariable("relationId") java.lang.String relationId) {
		this.companyBusiness.deleteFolder(instanceId, relationId);
		return ResponseEntity.ok().build();
	}

	/**
	 * ManyToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/Address")
	public List<Address> listAddress(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.listAddress(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * ManyToMany Relationship POST
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/{instanceId}/Address")
	public ResponseEntity<?> postAddress(@Validated @RequestBody final Address entity,
			@PathVariable("instanceId") java.lang.String instanceId) throws Exception {
		Person newPerson = new Person();

		Company instance = this.companyBusiness.get(instanceId);

		newPerson.setAddress(entity);
		newPerson.setCompany(instance);

		this.personBusiness.post(newPerson);

		return ResponseEntity.ok(newPerson.getCompany());
	}

	/**
	 * ManyToMany Relationship DELETE
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/Address/{relationId}")
	public ResponseEntity<?> deleteAddress(@PathVariable("instanceId") java.lang.String instanceId,
			@PathVariable("relationId") java.lang.String relationId) {
		this.companyBusiness.deleteAddress(instanceId, relationId);
		return ResponseEntity.ok().build();
	}

	/**
	 * ManyToMany Relationship GET
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{instanceId}/NeonewsUser_2")
	public List<NeonewsUser> listNeonewsUser_2(@PathVariable("instanceId") java.lang.String instanceId,
			@RequestParam(defaultValue = "100", required = false) Integer limit,
			@RequestParam(defaultValue = "0", required = false) Integer offset) {
		return companyBusiness.listNeonewsUser_2(instanceId, new PageRequest(offset, limit));
	}

	/**
	 * ManyToMany Relationship POST
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/{instanceId}/NeonewsUser_2")
	public ResponseEntity<?> postNeonewsUser_2(@Validated @RequestBody final NeonewsUser entity,
			@PathVariable("instanceId") java.lang.String instanceId) throws Exception {
		UserCompany newUserCompany = new UserCompany();

		Company instance = this.companyBusiness.get(instanceId);

		newUserCompany.setUser(entity);
		newUserCompany.setCompany(instance);

		this.userCompanyBusiness.post(newUserCompany);

		return ResponseEntity.ok(newUserCompany.getCompany());
	}

	/**
	 * ManyToMany Relationship DELETE
	 * @generated
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/{instanceId}/NeonewsUser_2/{relationId}")
	public ResponseEntity<?> deleteNeonewsUser_2(@PathVariable("instanceId") java.lang.String instanceId,
			@PathVariable("relationId") java.lang.String relationId) {
		this.companyBusiness.deleteNeonewsUser_2(instanceId, relationId);
		return ResponseEntity.ok().build();
	}

}
