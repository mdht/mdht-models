/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.FindingAboutOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finding About</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FindingAboutImpl extends ObservationImpl implements FindingAbout {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindingAboutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.FINDING_ABOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutTargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutInterpretationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutFindingObservationObjectAssociation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutFindingObservationObjectAssociation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutStudyFindingEvaluator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutStudyFindingEvaluator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutfindingObservationObjectAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFindingAboutfindingObservationObjectAssociationObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return FindingAboutOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return FindingAboutOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return FindingAboutOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return FindingAboutOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return FindingAboutOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return FindingAboutOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindingAbout init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public FindingAbout init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //FindingAboutImpl
