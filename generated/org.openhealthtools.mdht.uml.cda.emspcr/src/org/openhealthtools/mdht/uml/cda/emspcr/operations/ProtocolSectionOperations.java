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

import org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Protocol Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#validateProtocolSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#validateProtocolSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#validateProtocolSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#validateProtocolSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#validateProtocolSectionProtocolObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Protocol Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#validateProtocolSectionCandidatePatientRegistryType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Candidate Patient Registry Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#getProtocolObservation() <em>Get Protocol Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection#getCandidatePatientRegistryType() <em>Get Candidate Patient Registry Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolSectionOperations extends SectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ProtocolSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateProtocolSectionTemplateId(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProtocolSectionTemplateId(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.7')";

	/**
	* The cached OCL invariant for the '{@link #validateProtocolSectionTemplateId(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProtocolSectionTemplateId(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param protocolSection The receiving '<em><b>Protocol Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProtocolSectionTemplateId(ProtocolSection protocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_SECTION);
			try {
				VALIDATE_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			protocolSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROTOCOL_SECTION__PROTOCOL_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ProtocolSectionTemplateId"), new Object[] { protocolSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProtocolSectionCode(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProtocolSectionCode(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67537-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateProtocolSectionCode(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProtocolSectionCode(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param protocolSection The receiving '<em><b>Protocol Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProtocolSectionCode(ProtocolSection protocolSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_SECTION);
			try {
				VALIDATE_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(protocolSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROTOCOL_SECTION__PROTOCOL_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("ProtocolSectionCode"), new Object[] { protocolSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProtocolSectionTitle(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProtocolSectionTitle(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Protocol Section')";

	/**
	* The cached OCL invariant for the '{@link #validateProtocolSectionTitle(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProtocolSectionTitle(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param protocolSection The receiving '<em><b>Protocol Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProtocolSectionTitle(ProtocolSection protocolSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_SECTION);
			try {
				VALIDATE_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			protocolSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROTOCOL_SECTION__PROTOCOL_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("ProtocolSectionTitle"), new Object[] { protocolSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProtocolSectionText(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProtocolSectionText(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateProtocolSectionText(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProtocolSectionText(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param protocolSection The receiving '<em><b>Protocol Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProtocolSectionText(ProtocolSection protocolSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_SECTION);
			try {
				VALIDATE_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(protocolSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROTOCOL_SECTION__PROTOCOL_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("ProtocolSectionText"), new Object[] { protocolSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProtocolSectionProtocolObservation(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Protocol Observation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProtocolSectionProtocolObservation(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROTOCOL_SECTION_PROTOCOL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ProtocolObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateProtocolSectionProtocolObservation(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Protocol Observation</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProtocolSectionProtocolObservation(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROTOCOL_SECTION_PROTOCOL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param protocolSection The receiving '<em><b>Protocol Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProtocolSectionProtocolObservation(ProtocolSection protocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROTOCOL_SECTION_PROTOCOL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_SECTION);
			try {
				VALIDATE_PROTOCOL_SECTION_PROTOCOL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_SECTION_PROTOCOL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_SECTION_PROTOCOL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			protocolSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROTOCOL_SECTION__PROTOCOL_SECTION_PROTOCOL_OBSERVATION,
					EmspcrPlugin.INSTANCE.getString("ProtocolSectionProtocolObservation"),
					new Object[] { protocolSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProtocolSectionCandidatePatientRegistryType(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Candidate Patient Registry Type</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProtocolSectionCandidatePatientRegistryType(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::CandidatePatientRegistryType) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateProtocolSectionCandidatePatientRegistryType(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Section Candidate Patient Registry Type</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProtocolSectionCandidatePatientRegistryType(ProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param protocolSection The receiving '<em><b>Protocol Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProtocolSectionCandidatePatientRegistryType(ProtocolSection protocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_SECTION);
			try {
				VALIDATE_PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			protocolSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROTOCOL_SECTION__PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE,
					EmspcrPlugin.INSTANCE.getString("ProtocolSectionCandidatePatientRegistryType"),
					new Object[] { protocolSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getProtocolObservation(ProtocolSection) <em>Get Protocol Observation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProtocolObservation(ProtocolSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROTOCOL_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ProtocolObservation))->asSequence()->any(true).oclAsType(emspcr::ProtocolObservation)";

	/**
	* The cached OCL query for the '{@link #getProtocolObservation(ProtocolSection) <em>Get Protocol Observation</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProtocolObservation(ProtocolSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROTOCOL_OBSERVATION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static ProtocolObservation getProtocolObservation(ProtocolSection protocolSection) {
		if (GET_PROTOCOL_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PROTOCOL_SECTION,
				EmspcrPackage.Literals.PROTOCOL_SECTION.getEAllOperations().get(61));
			try {
				GET_PROTOCOL_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PROTOCOL_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROTOCOL_OBSERVATION__EOCL_QRY);
		return (ProtocolObservation) query.evaluate(protocolSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getCandidatePatientRegistryType(ProtocolSection) <em>Get Candidate Patient Registry Type</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getCandidatePatientRegistryType(ProtocolSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_CANDIDATE_PATIENT_REGISTRY_TYPE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::CandidatePatientRegistryType))->asSequence()->any(true).oclAsType(emspcr::CandidatePatientRegistryType)";

	/**
	* The cached OCL query for the '{@link #getCandidatePatientRegistryType(ProtocolSection) <em>Get Candidate Patient Registry Type</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getCandidatePatientRegistryType(ProtocolSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_CANDIDATE_PATIENT_REGISTRY_TYPE__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static CandidatePatientRegistryType getCandidatePatientRegistryType(ProtocolSection protocolSection) {
		if (GET_CANDIDATE_PATIENT_REGISTRY_TYPE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PROTOCOL_SECTION,
				EmspcrPackage.Literals.PROTOCOL_SECTION.getEAllOperations().get(62));
			try {
				GET_CANDIDATE_PATIENT_REGISTRY_TYPE__EOCL_QRY = helper.createQuery(GET_CANDIDATE_PATIENT_REGISTRY_TYPE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CANDIDATE_PATIENT_REGISTRY_TYPE__EOCL_QRY);
		return (CandidatePatientRegistryType) query.evaluate(protocolSection);
	}

} // ProtocolSectionOperations
