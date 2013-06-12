/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch;
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Dispatch Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#validateDispatchSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#validateDispatchSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#validateDispatchSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#validateDispatchSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#validateDispatchSectionEmergencyMedicalDispatchObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Emergency Medical Dispatch Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#validateDispatchSectionComplaintReportedByDispatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Complaint Reported By Dispatch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#getEmergencyMedicalDispatchObservation() <em>Get Emergency Medical Dispatch Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection#getComplaintReportedByDispatch() <em>Get Complaint Reported By Dispatch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DispatchSectionOperations extends SectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected DispatchSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateDispatchSectionTemplateId(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDispatchSectionTemplateId(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISPATCH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.2')";

	/**
	* The cached OCL invariant for the '{@link #validateDispatchSectionTemplateId(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDispatchSectionTemplateId(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISPATCH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dispatchSection The receiving '<em><b>Dispatch Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDispatchSectionTemplateId(DispatchSection dispatchSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISPATCH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_SECTION);
			try {
				VALIDATE_DISPATCH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPATCH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPATCH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dispatchSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DISPATCH_SECTION__DISPATCH_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("DispatchSectionTemplateId"), new Object[] { dispatchSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDispatchSectionCode(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDispatchSectionCode(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISPATCH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67660-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateDispatchSectionCode(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDispatchSectionCode(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISPATCH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dispatchSection The receiving '<em><b>Dispatch Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDispatchSectionCode(DispatchSection dispatchSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DISPATCH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_SECTION);
			try {
				VALIDATE_DISPATCH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPATCH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPATCH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dispatchSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DISPATCH_SECTION__DISPATCH_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("DispatchSectionCode"), new Object[] { dispatchSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDispatchSectionTitle(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDispatchSectionTitle(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISPATCH_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Dispatch')";

	/**
	* The cached OCL invariant for the '{@link #validateDispatchSectionTitle(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDispatchSectionTitle(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISPATCH_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dispatchSection The receiving '<em><b>Dispatch Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDispatchSectionTitle(DispatchSection dispatchSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DISPATCH_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_SECTION);
			try {
				VALIDATE_DISPATCH_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPATCH_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPATCH_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dispatchSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DISPATCH_SECTION__DISPATCH_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("DispatchSectionTitle"), new Object[] { dispatchSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDispatchSectionText(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDispatchSectionText(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISPATCH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateDispatchSectionText(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDispatchSectionText(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISPATCH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dispatchSection The receiving '<em><b>Dispatch Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDispatchSectionText(DispatchSection dispatchSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DISPATCH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_SECTION);
			try {
				VALIDATE_DISPATCH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPATCH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPATCH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dispatchSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DISPATCH_SECTION__DISPATCH_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("DispatchSectionText"), new Object[] { dispatchSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDispatchSectionEmergencyMedicalDispatchObservation(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Emergency Medical Dispatch Observation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDispatchSectionEmergencyMedicalDispatchObservation(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISPATCH_SECTION_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::EmergencyMedicalDispatchObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateDispatchSectionEmergencyMedicalDispatchObservation(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Emergency Medical Dispatch Observation</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDispatchSectionEmergencyMedicalDispatchObservation(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISPATCH_SECTION_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dispatchSection The receiving '<em><b>Dispatch Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDispatchSectionEmergencyMedicalDispatchObservation(DispatchSection dispatchSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISPATCH_SECTION_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_SECTION);
			try {
				VALIDATE_DISPATCH_SECTION_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPATCH_SECTION_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISPATCH_SECTION_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dispatchSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DISPATCH_SECTION__DISPATCH_SECTION_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION,
					EmspcrPlugin.INSTANCE.getString("DispatchSectionEmergencyMedicalDispatchObservation"),
					new Object[] { dispatchSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDispatchSectionComplaintReportedByDispatch(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Complaint Reported By Dispatch</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDispatchSectionComplaintReportedByDispatch(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISPATCH_SECTION_COMPLAINT_REPORTED_BY_DISPATCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ComplaintReportedByDispatch) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateDispatchSectionComplaintReportedByDispatch(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Section Complaint Reported By Dispatch</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDispatchSectionComplaintReportedByDispatch(DispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISPATCH_SECTION_COMPLAINT_REPORTED_BY_DISPATCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dispatchSection The receiving '<em><b>Dispatch Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDispatchSectionComplaintReportedByDispatch(DispatchSection dispatchSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISPATCH_SECTION_COMPLAINT_REPORTED_BY_DISPATCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_SECTION);
			try {
				VALIDATE_DISPATCH_SECTION_COMPLAINT_REPORTED_BY_DISPATCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPATCH_SECTION_COMPLAINT_REPORTED_BY_DISPATCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISPATCH_SECTION_COMPLAINT_REPORTED_BY_DISPATCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dispatchSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DISPATCH_SECTION__DISPATCH_SECTION_COMPLAINT_REPORTED_BY_DISPATCH,
					EmspcrPlugin.INSTANCE.getString("DispatchSectionComplaintReportedByDispatch"),
					new Object[] { dispatchSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getEmergencyMedicalDispatchObservation(DispatchSection) <em>Get Emergency Medical Dispatch Observation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getEmergencyMedicalDispatchObservation(DispatchSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::EmergencyMedicalDispatchObservation))->asSequence()->any(true).oclAsType(emspcr::EmergencyMedicalDispatchObservation)";

	/**
	* The cached OCL query for the '{@link #getEmergencyMedicalDispatchObservation(DispatchSection) <em>Get Emergency Medical Dispatch Observation</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getEmergencyMedicalDispatchObservation(DispatchSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static EmergencyMedicalDispatchObservation getEmergencyMedicalDispatchObservation(
			DispatchSection dispatchSection) {
		if (GET_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.DISPATCH_SECTION,
				EmspcrPackage.Literals.DISPATCH_SECTION.getEAllOperations().get(61));
			try {
				GET_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EOCL_QRY = helper.createQuery(GET_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EOCL_QRY);
		return (EmergencyMedicalDispatchObservation) query.evaluate(dispatchSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getComplaintReportedByDispatch(DispatchSection) <em>Get Complaint Reported By Dispatch</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getComplaintReportedByDispatch(DispatchSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_COMPLAINT_REPORTED_BY_DISPATCH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ComplaintReportedByDispatch))->asSequence()->any(true).oclAsType(emspcr::ComplaintReportedByDispatch)";

	/**
	* The cached OCL query for the '{@link #getComplaintReportedByDispatch(DispatchSection) <em>Get Complaint Reported By Dispatch</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getComplaintReportedByDispatch(DispatchSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_COMPLAINT_REPORTED_BY_DISPATCH__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static ComplaintReportedByDispatch getComplaintReportedByDispatch(DispatchSection dispatchSection) {
		if (GET_COMPLAINT_REPORTED_BY_DISPATCH__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.DISPATCH_SECTION,
				EmspcrPackage.Literals.DISPATCH_SECTION.getEAllOperations().get(62));
			try {
				GET_COMPLAINT_REPORTED_BY_DISPATCH__EOCL_QRY = helper.createQuery(GET_COMPLAINT_REPORTED_BY_DISPATCH__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMPLAINT_REPORTED_BY_DISPATCH__EOCL_QRY);
		return (ComplaintReportedByDispatch) query.evaluate(dispatchSection);
	}

} // DispatchSectionOperations
