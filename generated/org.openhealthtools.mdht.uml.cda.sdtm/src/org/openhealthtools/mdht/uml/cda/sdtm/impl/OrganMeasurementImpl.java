/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.OrganMeasurementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organ Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OrganMeasurementImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements OrganMeasurement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.ORGAN_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementInterpretationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementSpecimenInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementExclusionReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementExclusionReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOrganMeasurementSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OrganMeasurementOperations.validateOrganMeasurementSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return OrganMeasurementOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenInformation getSpecimenInformation() {
		return OrganMeasurementOperations.getSpecimenInformation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return OrganMeasurementOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment getComment() {
		return OrganMeasurementOperations.getComment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return OrganMeasurementOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExclusionReason getExclusionReason() {
		return OrganMeasurementOperations.getExclusionReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return OrganMeasurementOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return OrganMeasurementOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganMeasurement init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public OrganMeasurement init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //OrganMeasurementImpl
