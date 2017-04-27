/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientAge;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy;
import org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSPhysicalAssessmentSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Physical Assessment Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EMSPhysicalAssessmentSectionImpl extends org.eclipse.mdht.uml.cda.impl.SectionImpl implements EMSPhysicalAssessmentSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSPhysicalAssessmentSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPhysicalAssessmentSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPhysicalAssessmentSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPhysicalAssessmentSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPhysicalAssessmentSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPhysicalAssessmentSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPhysicalAssessmentSectionPhysicalAssessmentOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionPhysicalAssessmentOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPhysicalAssessmentSectionPatientPregnancy(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionPatientPregnancy(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPhysicalAssessmentSectionLastOralIntake(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionLastOralIntake(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPhysicalAssessmentSectionPatientAge(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionPatientAge(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPhysicalAssessmentSectionThrombolyticContraindications(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionThrombolyticContraindications(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPhysicalAssessmentSectionBarriersToPatientCare(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionBarriersToPatientCare(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalAssessmentOrganizer getPhysicalAssessmentOrganizer() {
		return EMSPhysicalAssessmentSectionOperations.getPhysicalAssessmentOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientPregnancy getPatientPregnancy() {
		return EMSPhysicalAssessmentSectionOperations.getPatientPregnancy(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastOralIntake getLastOralIntake() {
		return EMSPhysicalAssessmentSectionOperations.getLastOralIntake(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAge getPatientAge() {
		return EMSPhysicalAssessmentSectionOperations.getPatientAge(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrombolyticContraindications getThrombolyticContraindications() {
		return EMSPhysicalAssessmentSectionOperations.getThrombolyticContraindications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarriersToPatientCare getBarriersToPatientCare() {
		return EMSPhysicalAssessmentSectionOperations.getBarriersToPatientCare(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPhysicalAssessmentSection init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EMSPhysicalAssessmentSection init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // EMSPhysicalAssessmentSectionImpl
