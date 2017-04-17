/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.ReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyArm;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonhumanSubjectDemographicsOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nonhuman Subject Demographics</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NonhumanSubjectDemographicsImpl extends org.eclipse.mdht.uml.cda.impl.ActImpl implements NonhumanSubjectDemographics {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonhumanSubjectDemographicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsStudyArm(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsStudyArm(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsReferencePeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsReferencePeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsstrainAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsstrainAssociationSubjectStrain(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationSubjectStrain(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsageAssociationSubjectAgeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsageAssociationSubjectAgeClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsageAssociationSubjectAgeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsageAssociationSubjectAgeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsageAssociationSubjectAgeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsageAssociationSubjectAgeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsageAssociationSubjectAgeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsageAssociationSubjectAgeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsageAssociationSubjectAgeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsageAssociationSubjectAgeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsageAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsageAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsageAssociationSubjectAge(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsageAssociationSubjectAge(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicsspeciesAssociationSubjectSpecies(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationSubjectSpecies(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDemographicssetMembershipAssociationSetMembership(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationSetMembership(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudyArm> getStudyArms() {
		return NonhumanSubjectDemographicsOperations.getStudyArms(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return NonhumanSubjectDemographicsOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return NonhumanSubjectDemographicsOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return NonhumanSubjectDemographicsOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return NonhumanSubjectDemographicsOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferencePeriod getReferencePeriod() {
		return NonhumanSubjectDemographicsOperations.getReferencePeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonhumanSubjectDemographics init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public NonhumanSubjectDemographics init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //NonhumanSubjectDemographicsImpl
