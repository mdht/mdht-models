/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.InclusionorExclusionCriteriaNotMetOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InclusionorExclusionCriteriaNotMetImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements InclusionorExclusionCriteriaNotMet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InclusionorExclusionCriteriaNotMetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInclusionorExclusionCriteriaNotMetTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInclusionorExclusionCriteriaNotMetClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInclusionorExclusionCriteriaNotMetMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInclusionorExclusionCriteriaNotMetId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInclusionorExclusionCriteriaNotMetCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInclusionorExclusionCriteriaNotMetCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInclusionorExclusionCriteriaNotMetValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInclusionorExclusionCriteriaNotMetDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInclusionorExclusionCriteriaNotMetComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInclusionorExclusionCriteriaNotMetDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInclusionorExclusionCriteriaNotMetRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInclusionorExclusionCriteriaNotMetSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInclusionorExclusionCriteriaNotMetCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInclusionorExclusionCriteriaNotMetSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInclusionorExclusionCriteriaNotMetFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return InclusionorExclusionCriteriaNotMetOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return InclusionorExclusionCriteriaNotMetOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return InclusionorExclusionCriteriaNotMetOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return InclusionorExclusionCriteriaNotMetOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return InclusionorExclusionCriteriaNotMetOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return InclusionorExclusionCriteriaNotMetOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return InclusionorExclusionCriteriaNotMetOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return InclusionorExclusionCriteriaNotMetOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InclusionorExclusionCriteriaNotMet init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public InclusionorExclusionCriteriaNotMet init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //InclusionorExclusionCriteriaNotMetImpl
