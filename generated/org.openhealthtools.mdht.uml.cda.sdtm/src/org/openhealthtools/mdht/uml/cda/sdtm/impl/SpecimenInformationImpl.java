/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.SpecimenInformationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SpecimenInformationImpl extends org.eclipse.mdht.uml.cda.impl.ProcedureImpl implements SpecimenInformation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.SPECIMEN_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationTargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationParticipatingSpecimen(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationParticipatingSpecimen(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationEventStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationEventStudyDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationTimingReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationPortionAssociation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationPortionAssociation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationUsabilityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationUsabilityAssociation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationConditionAssociation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationConditionAssociation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationparticipatingSpecimenTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationparticipatingSpecimenTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationparticipatingSpecimenRoleOfSpecimen(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenRoleOfSpecimen(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationportionAssociationportionOrTotalityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationportionAssociationportionOrTotalityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationportionAssociationportionOrTotalityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationportionAssociationportionOrTotalityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationportionAssociationportionOrTotalityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationportionAssociationportionOrTotalityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationportionAssociationportionOrTotalityValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationportionAssociationportionOrTotalityValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationportionAssociationportionOrTotalityValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationportionAssociationportionOrTotalityValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationportionAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationportionAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationportionAssociationSpecimenCondition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationportionAssociationSpecimenCondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationusabilityAssociationspecimenUsabilityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationusabilityAssociationspecimenUsabilityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationusabilityAssociationspecimenUsabilityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationusabilityAssociationspecimenUsabilityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationusabilityAssociationspecimenUsabilityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationusabilityAssociationspecimenUsabilityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationusabilityAssociationspecimenUsabilityValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationusabilityAssociationspecimenUsabilityValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationusabilityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationusabilityAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationusabilityAssociationSpecimenUsability(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationusabilityAssociationSpecimenUsability(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationconditionAssociationspecimenConditionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationconditionAssociationspecimenConditionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationconditionAssociationspecimenConditionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationconditionAssociationspecimenConditionValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationconditionAssociationspecimenConditionValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationconditionAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSpecimenInformationconditionAssociationSpecimenCondition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationSpecimenCondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventStudyDay getEventStudyDay() {
		return SpecimenInformationOperations.getEventStudyDay(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingReference getTimingReference() {
		return SpecimenInformationOperations.getTimingReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenInformation init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public SpecimenInformation init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //SpecimenInformationImpl
