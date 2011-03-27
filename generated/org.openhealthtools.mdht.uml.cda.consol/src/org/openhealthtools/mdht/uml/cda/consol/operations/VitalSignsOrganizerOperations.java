/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.VitalSign;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateVitalSignsOrganizerInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateVitalSignsOrganizerRequireResultsOrganizerTemplateID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Require Results Organizer Template ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateVitalSignsOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateVitalSignsOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateVitalSignsOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#getVitalSignObservations() <em>Get Vital Sign Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer#validateResultOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignsOrganizerOperations extends ResultOrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignsOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizerInformationSource(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerInformationSource(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "+
"or not self.getSection().informant->isEmpty()"+
"or not self.getClinicalDocument().informant->isEmpty()"+
"or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizerInformationSource(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerInformationSource(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGNS_ORGANIZER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.informant->isEmpty() 
	 * or not self.getSection().informant->isEmpty()
	 * or not self.getClinicalDocument().informant->isEmpty()
	 * or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignsOrganizerInformationSource(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGNS_ORGANIZER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNS_ORGANIZER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNS_ORGANIZER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_INFORMATION_SOURCE,
						 ConsolPlugin.INSTANCE.getString("VitalSignsOrganizerInformationSource"),
						 new Object [] { vitalSignsOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizerRequireResultsOrganizerTemplateID(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Require Results Organizer Template ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerRequireResultsOrganizerTemplateID(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root ='2.16.840.1.113883.10.20.1.32')";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizerRequireResultsOrganizerTemplateID(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Require Results Organizer Template ID</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerRequireResultsOrganizerTemplateID(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root ='2.16.840.1.113883.10.20.1.32')
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignsOrganizerRequireResultsOrganizerTemplateID(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("VitalSignsOrganizerRequireResultsOrganizerTemplateID"),
						 new Object [] { vitalSignsOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizerClassCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerClassCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizerClassCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerClassCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGNS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignsOrganizerClassCode(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGNS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("VitalSignsOrganizerClassCode"),
						 new Object [] { vitalSignsOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("VitalSignsOrganizerEffectiveTime"),
						 new Object [] { vitalSignsOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizerId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizerId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGNS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignsOrganizerId(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGNS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_ID,
						 ConsolPlugin.INSTANCE.getString("VitalSignsOrganizerId"),
						 new Object [] { vitalSignsOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignObservations(VitalSignsOrganizer) <em>Get Vital Sign Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignObservations(VitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::VitalSign)).oclAsType(consol::VitalSign)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignObservations(VitalSignsOrganizer) <em>Get Vital Sign Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignObservations(VitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGN_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::VitalSign)).oclAsType(consol::VitalSign)
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<VitalSign> getVitalSignObservations(VitalSignsOrganizer vitalSignsOrganizer) {
		if (GET_VITAL_SIGN_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER, ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER.getEAllOperations().get(63));
			try {
				GET_VITAL_SIGN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_VITAL_SIGN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<VitalSign> result = (Collection<VitalSign>) query.evaluate(vitalSignsOrganizer);
		return new BasicEList.UnmodifiableEList<VitalSign>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerTemplateId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.13.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerTemplateId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.13.1')
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultOrganizerTemplateId(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGNS_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultOrganizerTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSignsOrganizer, context) }),
						 new Object [] { vitalSignsOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = '46680005' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '46680005' and value.codeSystem = '2.16.840.1.113883.6.96'))
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultOrganizerCode(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGNS_ORGANIZER__RESULT_ORGANIZER_CODE,
						 ConsolPlugin.INSTANCE.getString("ResultOrganizerCode"),
						 new Object [] { vitalSignsOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerStatusCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerStatusCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerStatusCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerStatusCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultOrganizerStatusCode(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGNS_ORGANIZER__RESULT_ORGANIZER_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("ResultOrganizerStatusCode"),
						 new Object [] { vitalSignsOrganizer }));
			}
			return false;
		}
		return true;
	}

} // VitalSignsOrganizerOperations