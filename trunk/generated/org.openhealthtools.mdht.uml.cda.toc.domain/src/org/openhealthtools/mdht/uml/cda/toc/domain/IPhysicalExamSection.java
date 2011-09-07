/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Exam Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     The Physical Examination Section contains information describing the physical findings. 
 * </p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPhysicalExamSection#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getPhysicalExamSection()
 * @generated
 */
public interface IPhysicalExamSection {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Section)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getPhysicalExamSection_CDAType()
	 * @generated
	 */
	Section getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPhysicalExamSection#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Section value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::vitalSignsSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::VitalSignsSection))->asSequence()->first().oclAsType(domain::VitalSignsSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignsSection getVitalSignsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Vital Signs Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.3.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignsSection withVitalSignsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Vital Signs Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.3.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setVitalSignsSection(IVitalSignsSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::generalAppearanceSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::GeneralAppearanceSection))->asSequence()->first().oclAsType(domain::GeneralAppearanceSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGeneralAppearanceSection getGeneralAppearanceSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] General Appearance Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.16).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGeneralAppearanceSection withGeneralAppearanceSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] General Appearance Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.16).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setGeneralAppearanceSection(IGeneralAppearanceSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::visibleImplantedMedicalDevicesSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::VisibleImplantedMedicalDevicesSection))->asSequence()->first().oclAsType(domain::VisibleImplantedMedicalDevicesSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVisibleImplantedMedicalDevicesSection getVisibleImplantedMedicalDevicesSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Visible Implanted Medical Devices Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.48).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVisibleImplantedMedicalDevicesSection withVisibleImplantedMedicalDevicesSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Visible Implanted Medical Devices Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.48).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setVisibleImplantedMedicalDevicesSection(IVisibleImplantedMedicalDevicesSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::integumentarySystemSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::IntegumentarySystemSection))->asSequence()->first().oclAsType(domain::IntegumentarySystemSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IIntegumentarySystemSection getIntegumentarySystemSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Integumentary System Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.17).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IIntegumentarySystemSection withIntegumentarySystemSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Integumentary System Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.17).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setIntegumentarySystemSection(IIntegumentarySystemSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::headSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::HeadSection))->asSequence()->first().oclAsType(domain::HeadSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHeadSection getHeadSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Head Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.18).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHeadSection withHeadSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Head Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.18).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setHeadSection(IHeadSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::eyesSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::EyesSection))->asSequence()->first().oclAsType(domain::EyesSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEyesSection getEyesSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Eyes Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.19).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEyesSection withEyesSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Eyes Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.19).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setEyesSection(IEyesSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::earsNoseMouthThroatSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::EarsNoseMouthThroatSection))->asSequence()->first().oclAsType(domain::EarsNoseMouthThroatSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEarsNoseMouthThroatSection getEarsNoseMouthThroatSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Ears Nose Mouth Throat Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.20).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEarsNoseMouthThroatSection withEarsNoseMouthThroatSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Ears Nose Mouth Throat Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.20).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setEarsNoseMouthThroatSection(IEarsNoseMouthThroatSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::earsSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::EarsSection))->asSequence()->first().oclAsType(domain::EarsSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEarsSection getEarsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Ears Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.21).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEarsSection withEarsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Ears Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.21).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setEarsSection(IEarsSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::noseSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::NoseSection))->asSequence()->first().oclAsType(domain::NoseSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	INoseSection getNoseSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Nose Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.22).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	INoseSection withNoseSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Nose Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.22).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setNoseSection(INoseSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::mouthThroatTeethSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::MouthThroatTeethSection))->asSequence()->first().oclAsType(domain::MouthThroatTeethSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMouthThroatTeethSection getMouthThroatTeethSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Mouth Throat Teeth Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.23).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMouthThroatTeethSection withMouthThroatTeethSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Mouth Throat Teeth Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.23).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setMouthThroatTeethSection(IMouthThroatTeethSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::neckSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::NeckSection))->asSequence()->first().oclAsType(domain::NeckSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	INeckSection getNeckSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Neck Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.24).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	INeckSection withNeckSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Neck Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.24).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setNeckSection(INeckSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::endocrineSystemSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::EndocrineSystemSection))->asSequence()->first().oclAsType(domain::EndocrineSystemSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEndocrineSystemSection getEndocrineSystemSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Endocrine System Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEndocrineSystemSection withEndocrineSystemSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Endocrine System Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setEndocrineSystemSection(IEndocrineSystemSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::thoraxLungsSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ThoraxLungsSection))->asSequence()->first().oclAsType(domain::ThoraxLungsSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IThoraxLungsSection getThoraxLungsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Thorax Lungs Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.26).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IThoraxLungsSection withThoraxLungsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Thorax Lungs Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.26).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setThoraxLungsSection(IThoraxLungsSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::chestWallSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ChestWallSection))->asSequence()->first().oclAsType(domain::ChestWallSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IChestWallSection getChestWallSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Chest Wall Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.27).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IChestWallSection withChestWallSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Chest Wall Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.27).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setChestWallSection(IChestWallSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::breastSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::BreastSection))->asSequence()->first().oclAsType(domain::BreastSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IBreastSection getBreastSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Breast Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.28).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IBreastSection withBreastSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Breast Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.28).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setBreastSection(IBreastSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::heartSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::HeartSection))->asSequence()->first().oclAsType(domain::HeartSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHeartSection getHeartSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Heart Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.29).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHeartSection withHeartSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Heart Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.29).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setHeartSection(IHeartSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::respiratorySystemSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::RespiratorySystemSection))->asSequence()->first().oclAsType(domain::RespiratorySystemSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IRespiratorySystemSection getRespiratorySystemSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Respiratory System Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.30).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IRespiratorySystemSection withRespiratorySystemSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Respiratory System Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.30).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setRespiratorySystemSection(IRespiratorySystemSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::abdomenSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::AbdomenSection))->asSequence()->first().oclAsType(domain::AbdomenSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAbdomenSection getAbdomenSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Abdomen Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.31).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAbdomenSection withAbdomenSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Abdomen Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.31).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setAbdomenSection(IAbdomenSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::lymphaticSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::LymphaticSection))->asSequence()->first().oclAsType(domain::LymphaticSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ILymphaticSection getLymphaticSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Lymphatic Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.32).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ILymphaticSection withLymphaticSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Lymphatic Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.32).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setLymphaticSection(ILymphaticSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::vesselsSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::VesselsSection))->asSequence()->first().oclAsType(domain::VesselsSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVesselsSection getVesselsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Vessels Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.33).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVesselsSection withVesselsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Vessels Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.33).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setVesselsSection(IVesselsSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::musculoskeletalSystemSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::MusculoskeletalSystemSection))->asSequence()->first().oclAsType(domain::MusculoskeletalSystemSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMusculoskeletalSystemSection getMusculoskeletalSystemSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Musculoskeletal System Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.34).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMusculoskeletalSystemSection withMusculoskeletalSystemSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Musculoskeletal System Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.34).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setMusculoskeletalSystemSection(IMusculoskeletalSystemSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::neurologicSystemSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::NeurologicSystemSection))->asSequence()->first().oclAsType(domain::NeurologicSystemSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	INeurologicSystemSection getNeurologicSystemSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Neurologic System Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.35).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	INeurologicSystemSection withNeurologicSystemSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Neurologic System Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.35).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setNeurologicSystemSection(INeurologicSystemSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::genitaliaSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::GenitaliaSection))->asSequence()->first().oclAsType(domain::GenitaliaSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGenitaliaSection getGenitaliaSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Genitalia Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.36).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGenitaliaSection withGenitaliaSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Genitalia Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.36).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setGenitaliaSection(IGenitaliaSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::rectumSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::RectumSection))->asSequence()->first().oclAsType(domain::RectumSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IRectumSection getRectumSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Rectum Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.37).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IRectumSection withRectumSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Rectum Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.9.37).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setRectumSection(IRectumSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::PhysicalExamSection::extremitiesSection.
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ExtremitiesSection))->asSequence()->first().oclAsType(domain::ExtremitiesSection)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IExtremitiesSection getExtremitiesSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Extremities Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.16.2.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IExtremitiesSection withExtremitiesSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Physical Exam Section MAY contain zero or one [0..1] component, such that Contains exactly one [1..1] Extremities Section (templateId: 1.3.6.1.4.1.19376.1.5.3.1.1.16.2.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection setExtremitiesSection(IExtremitiesSection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::PhysicalExamSection::condition.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::Condition)).oclAsType(domain::Condition)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<ICondition> getConditions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Physical Exam Section SHALL contain at least one [1..*] entry, such that Contains exactly one [1..1] Condition (templateId: 2.16.840.1.113883.3.88.11.83.7).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICondition addCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Physical Exam Section SHALL contain at least one [1..*] entry, such that Contains exactly one [1..1] Condition (templateId: 2.16.840.1.113883.3.88.11.83.7).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPhysicalExamSection addCondition(ICondition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection init();
} // IPhysicalExamSection
