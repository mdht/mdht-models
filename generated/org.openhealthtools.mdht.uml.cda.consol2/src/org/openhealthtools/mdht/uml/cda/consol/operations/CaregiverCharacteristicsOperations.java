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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Caregiver Characteristics</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsValueCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Value Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsParticipantParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsParticipantTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsParticipantTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsParticipantTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics#validateCaregiverCharacteristicsParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Participant Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaregiverCharacteristicsOperations extends ClinicalStatementOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaregiverCharacteristicsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsValueCodeSystem(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Value Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsValueCodeSystem(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_VALUE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->forAll(val | val.isNullFlavorDefined() or val.oclAsType(datatypes::CD).codeSystem = '2.16.840.1.113883.6.1' or val.oclAsType(datatypes::CD).codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsValueCodeSystem(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Value Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsValueCodeSystem(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CAREGIVER_CHARACTERISTICS_VALUE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCaregiverCharacteristicsValueCodeSystem(
			CaregiverCharacteristics caregiverCharacteristics, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_VALUE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				VALIDATE_CAREGIVER_CHARACTERISTICS_VALUE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CAREGIVER_CHARACTERISTICS_VALUE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CAREGIVER_CHARACTERISTICS_VALUE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				caregiverCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_VALUE_CODE_SYSTEM,
						ConsolPlugin.INSTANCE.getString(
							"CaregiverCharacteristicsCaregiverCharacteristicsValueCodeSystem"),
						new Object[] { caregiverCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsTemplateId(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsTemplateId(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.72')";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsTemplateId(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsTemplateId(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CAREGIVER_CHARACTERISTICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCaregiverCharacteristicsTemplateId(CaregiverCharacteristics caregiverCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				VALIDATE_CAREGIVER_CHARACTERISTICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CAREGIVER_CHARACTERISTICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CAREGIVER_CHARACTERISTICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				caregiverCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("CaregiverCharacteristicsCaregiverCharacteristicsTemplateId"),
						new Object[] { caregiverCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsClassCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsClassCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsClassCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsClassCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CAREGIVER_CHARACTERISTICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCaregiverCharacteristicsClassCode(CaregiverCharacteristics caregiverCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				VALIDATE_CAREGIVER_CHARACTERISTICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CAREGIVER_CHARACTERISTICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CAREGIVER_CHARACTERISTICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				caregiverCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("CaregiverCharacteristicsCaregiverCharacteristicsClassCode"),
						new Object[] { caregiverCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsMoodCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsMoodCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsMoodCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsMoodCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CAREGIVER_CHARACTERISTICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCaregiverCharacteristicsMoodCode(CaregiverCharacteristics caregiverCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				VALIDATE_CAREGIVER_CHARACTERISTICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CAREGIVER_CHARACTERISTICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CAREGIVER_CHARACTERISTICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				caregiverCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("CaregiverCharacteristicsCaregiverCharacteristicsMoodCode"),
						new Object[] { caregiverCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsId(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsId(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsId(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsId(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CAREGIVER_CHARACTERISTICS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCaregiverCharacteristicsId(CaregiverCharacteristics caregiverCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				VALIDATE_CAREGIVER_CHARACTERISTICS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CAREGIVER_CHARACTERISTICS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CAREGIVER_CHARACTERISTICS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				caregiverCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_ID,
						ConsolPlugin.INSTANCE.getString("CaregiverCharacteristicsCaregiverCharacteristicsId"),
						new Object[] { caregiverCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CAREGIVER_CHARACTERISTICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCaregiverCharacteristicsCode(CaregiverCharacteristics caregiverCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				VALIDATE_CAREGIVER_CHARACTERISTICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CAREGIVER_CHARACTERISTICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CAREGIVER_CHARACTERISTICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				caregiverCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_CODE,
						ConsolPlugin.INSTANCE.getString("CaregiverCharacteristicsCaregiverCharacteristicsCode"),
						new Object[] { caregiverCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsStatusCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsStatusCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsStatusCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsStatusCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CAREGIVER_CHARACTERISTICS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCaregiverCharacteristicsStatusCode(CaregiverCharacteristics caregiverCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				VALIDATE_CAREGIVER_CHARACTERISTICS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CAREGIVER_CHARACTERISTICS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CAREGIVER_CHARACTERISTICS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				caregiverCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("CaregiverCharacteristicsCaregiverCharacteristicsStatusCode"),
						new Object[] { caregiverCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsStatusCodeP(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsStatusCodeP(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsStatusCodeP(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsStatusCodeP(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CAREGIVER_CHARACTERISTICS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCaregiverCharacteristicsStatusCodeP(CaregiverCharacteristics caregiverCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				VALIDATE_CAREGIVER_CHARACTERISTICS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CAREGIVER_CHARACTERISTICS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CAREGIVER_CHARACTERISTICS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				caregiverCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("CaregiverCharacteristicsCaregiverCharacteristicsStatusCodeP"),
						new Object[] { caregiverCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsValue(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsValue(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsValue(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsValue(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CAREGIVER_CHARACTERISTICS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCaregiverCharacteristicsValue(CaregiverCharacteristics caregiverCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				VALIDATE_CAREGIVER_CHARACTERISTICS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CAREGIVER_CHARACTERISTICS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CAREGIVER_CHARACTERISTICS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				caregiverCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_VALUE,
						ConsolPlugin.INSTANCE.getString("CaregiverCharacteristicsCaregiverCharacteristicsValue"),
						new Object[] { caregiverCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsParticipant(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsParticipant(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsParticipant(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsParticipant(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCaregiverCharacteristicsParticipant(CaregiverCharacteristics caregiverCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				caregiverCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_PARTICIPANT,
						ConsolPlugin.INSTANCE.getString("CaregiverCharacteristicsCaregiverCharacteristicsParticipant"),
						new Object[] { caregiverCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsParticipantParticipantRoleClassCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Participant Role Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsParticipantParticipantRoleClassCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassRoot::CAREGIVER)";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsParticipantParticipantRoleClassCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Participant Role Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsParticipantParticipantRoleClassCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCaregiverCharacteristicsParticipantParticipantRoleClassCode(
			CaregiverCharacteristics caregiverCharacteristics, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			caregiverCharacteristics);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE,
							ConsolPlugin.INSTANCE.getString(
								"CaregiverCharacteristicsCaregiverCharacteristicsParticipantParticipantRoleClassCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsParticipantTimeLow(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsParticipantTimeLow(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(not time.oclIsUndefined() implies time.low->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsParticipantTimeLow(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsParticipantTimeLow(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCaregiverCharacteristicsParticipantTimeLow(
			CaregiverCharacteristics caregiverCharacteristics, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			caregiverCharacteristics);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_LOW,
							ConsolPlugin.INSTANCE.getString(
								"CaregiverCharacteristicsCaregiverCharacteristicsParticipantTimeLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsParticipantTimeHigh(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Time High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsParticipantTimeHigh(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(not time.oclIsUndefined() implies time.high->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsParticipantTimeHigh(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Time High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsParticipantTimeHigh(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCaregiverCharacteristicsParticipantTimeHigh(
			CaregiverCharacteristics caregiverCharacteristics, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			caregiverCharacteristics);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME_HIGH,
							ConsolPlugin.INSTANCE.getString(
								"CaregiverCharacteristicsCaregiverCharacteristicsParticipantTimeHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsParticipantTypeCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsParticipantTypeCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::IND)";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsParticipantTypeCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsParticipantTypeCode(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCaregiverCharacteristicsParticipantTypeCode(
			CaregiverCharacteristics caregiverCharacteristics, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			caregiverCharacteristics);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_PARTICIPANT_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"CaregiverCharacteristicsCaregiverCharacteristicsParticipantTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsParticipantTime(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsParticipantTime(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsParticipantTime(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsParticipantTime(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCaregiverCharacteristicsParticipantTime(
			CaregiverCharacteristics caregiverCharacteristics, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			caregiverCharacteristics);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_PARTICIPANT_TIME,
							ConsolPlugin.INSTANCE.getString(
								"CaregiverCharacteristicsCaregiverCharacteristicsParticipantTime"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCaregiverCharacteristicsParticipantParticipantRole(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsParticipantParticipantRole(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCaregiverCharacteristicsParticipantParticipantRole(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Caregiver Characteristics Participant Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCaregiverCharacteristicsParticipantParticipantRole(CaregiverCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param caregiverCharacteristics The receiving '<em><b>Caregiver Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCaregiverCharacteristicsParticipantParticipantRole(
			CaregiverCharacteristics caregiverCharacteristics, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			caregiverCharacteristics);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CAREGIVER_CHARACTERISTICS__CAREGIVER_CHARACTERISTICS_PARTICIPANT_PARTICIPANT_ROLE,
							ConsolPlugin.INSTANCE.getString(
								"CaregiverCharacteristicsCaregiverCharacteristicsParticipantParticipantRole"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // CaregiverCharacteristicsOperations
