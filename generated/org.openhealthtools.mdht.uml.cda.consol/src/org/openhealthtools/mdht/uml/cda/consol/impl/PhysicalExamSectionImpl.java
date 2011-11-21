/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.AbdomenSection;
import org.openhealthtools.mdht.uml.cda.consol.BreastSection;
import org.openhealthtools.mdht.uml.cda.consol.ChestWallSection;
import org.openhealthtools.mdht.uml.cda.consol.Condition;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EarsNoseMouthThroatSection;
import org.openhealthtools.mdht.uml.cda.consol.EarsSection;
import org.openhealthtools.mdht.uml.cda.consol.EndocrineSystemSection;
import org.openhealthtools.mdht.uml.cda.consol.ExtremitiesSection;
import org.openhealthtools.mdht.uml.cda.consol.EyesSection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralAppearanceSection;
import org.openhealthtools.mdht.uml.cda.consol.GenitaliaSection;
import org.openhealthtools.mdht.uml.cda.consol.HeadSection;
import org.openhealthtools.mdht.uml.cda.consol.HeartSection;
import org.openhealthtools.mdht.uml.cda.consol.IntegumentarySystemSection;
import org.openhealthtools.mdht.uml.cda.consol.LymphaticSection;
import org.openhealthtools.mdht.uml.cda.consol.MouthThroatTeethSection;
import org.openhealthtools.mdht.uml.cda.consol.MusculoskeletalSystemSection;
import org.openhealthtools.mdht.uml.cda.consol.NeckSection;
import org.openhealthtools.mdht.uml.cda.consol.NeurologicSystemSection;
import org.openhealthtools.mdht.uml.cda.consol.NoseSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.RectumSection;
import org.openhealthtools.mdht.uml.cda.consol.RespiratorySystemSection;
import org.openhealthtools.mdht.uml.cda.consol.ThoraxLungsSection;
import org.openhealthtools.mdht.uml.cda.consol.VesselsSection;
import org.openhealthtools.mdht.uml.cda.consol.VisibleImplantedMedicalDevicesSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;

import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicalExamSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Exam Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PhysicalExamSectionImpl extends SectionImpl implements PhysicalExamSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalExamSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PHYSICAL_EXAM_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionCondition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionCondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionGeneralAppearanceSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionGeneralAppearanceSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionVisibleImplantedMedicalDevicesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionVisibleImplantedMedicalDevicesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionIntegumentarySystemSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionIntegumentarySystemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionHeadSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionHeadSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionEyesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionEyesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionEarsNoseMouthThroatSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionEarsNoseMouthThroatSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionEarsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionEarsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionNoseSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionNoseSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionMouthThroatTeethSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionMouthThroatTeethSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionNeckSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionNeckSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionEndocrineSystemSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionEndocrineSystemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionThoraxLungsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionThoraxLungsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionChestWallSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionChestWallSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionBreastSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionBreastSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionHeartSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionHeartSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionRespiratorySystemSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionRespiratorySystemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionAbdomenSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionAbdomenSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionLymphaticSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionLymphaticSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionVesselsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionVesselsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionMusculoskeletalSystemSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionMusculoskeletalSystemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionNeurologicSystemSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionNeurologicSystemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionGenitaliaSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionGenitaliaSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionRectumSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionRectumSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionExtremitiesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionExtremitiesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		return PhysicalExamSectionOperations.getConditions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection getVitalSignsSection() {
		return PhysicalExamSectionOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralAppearanceSection getGeneralAppearanceSection() {
		return PhysicalExamSectionOperations.getGeneralAppearanceSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibleImplantedMedicalDevicesSection getVisibleImplantedMedicalDevicesSection() {
		return PhysicalExamSectionOperations.getVisibleImplantedMedicalDevicesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegumentarySystemSection getIntegumentarySystemSection() {
		return PhysicalExamSectionOperations.getIntegumentarySystemSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadSection getHeadSection() {
		return PhysicalExamSectionOperations.getHeadSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EyesSection getEyesSection() {
		return PhysicalExamSectionOperations.getEyesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarsNoseMouthThroatSection getEarsNoseMouthThroatSection() {
		return PhysicalExamSectionOperations.getEarsNoseMouthThroatSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarsSection getEarsSection() {
		return PhysicalExamSectionOperations.getEarsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoseSection getNoseSection() {
		return PhysicalExamSectionOperations.getNoseSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MouthThroatTeethSection getMouthThroatTeethSection() {
		return PhysicalExamSectionOperations.getMouthThroatTeethSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeckSection getNeckSection() {
		return PhysicalExamSectionOperations.getNeckSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndocrineSystemSection getEndocrineSystemSection() {
		return PhysicalExamSectionOperations.getEndocrineSystemSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoraxLungsSection getThoraxLungsSection() {
		return PhysicalExamSectionOperations.getThoraxLungsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChestWallSection getChestWallSection() {
		return PhysicalExamSectionOperations.getChestWallSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastSection getBreastSection() {
		return PhysicalExamSectionOperations.getBreastSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeartSection getHeartSection() {
		return PhysicalExamSectionOperations.getHeartSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespiratorySystemSection getRespiratorySystemSection() {
		return PhysicalExamSectionOperations.getRespiratorySystemSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbdomenSection getAbdomenSection() {
		return PhysicalExamSectionOperations.getAbdomenSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LymphaticSection getLymphaticSection() {
		return PhysicalExamSectionOperations.getLymphaticSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VesselsSection getVesselsSection() {
		return PhysicalExamSectionOperations.getVesselsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusculoskeletalSystemSection getMusculoskeletalSystemSection() {
		return PhysicalExamSectionOperations.getMusculoskeletalSystemSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeurologicSystemSection getNeurologicSystemSection() {
		return PhysicalExamSectionOperations.getNeurologicSystemSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenitaliaSection getGenitaliaSection() {
		return PhysicalExamSectionOperations.getGenitaliaSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectumSection getRectumSection() {
		return PhysicalExamSectionOperations.getRectumSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtremitiesSection getExtremitiesSection() {
		return PhysicalExamSectionOperations.getExtremitiesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExamSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //PhysicalExamSectionImpl
