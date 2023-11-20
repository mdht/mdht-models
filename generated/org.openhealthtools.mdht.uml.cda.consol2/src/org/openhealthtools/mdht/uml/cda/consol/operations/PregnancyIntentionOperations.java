package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pregnancy Intention</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention IVLTS High</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PregnancyIntentionOperations extends ClinicalStatementOperations {

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
	protected PregnancyIntentionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyIntentionTemplateId(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionTemplateId(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_INTENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.281' and id.extension = '2023-05-01')";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyIntentionTemplateId(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionTemplateId(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_INTENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyIntention The receiving '<em><b>Pregnancy Intention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyIntentionTemplateId(PregnancyIntention pregnancyIntention,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PregnancyIntentionPregnancyIntentionTemplateId", "ERROR");

		if (VALIDATE_PREGNANCY_INTENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_INTENTION);
			try {
				VALIDATE_PREGNANCY_INTENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_INTENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_INTENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pregnancyIntention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PREGNANCY_INTENTION__PREGNANCY_INTENTION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("PregnancyIntentionPregnancyIntentionTemplateId"),
						new Object[] { pregnancyIntention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyIntentionId(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionId(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_INTENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() =  1)";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyIntentionId(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionId(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_INTENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyIntention The receiving '<em><b>Pregnancy Intention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyIntentionId(PregnancyIntention pregnancyIntention,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PregnancyIntentionPregnancyIntentionId", "ERROR");

		if (VALIDATE_PREGNANCY_INTENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_INTENTION);
			try {
				VALIDATE_PREGNANCY_INTENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_INTENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PREGNANCY_INTENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			pregnancyIntention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PREGNANCY_INTENTION__PREGNANCY_INTENTION_ID,
						ConsolPlugin.INSTANCE.getString("PregnancyIntentionPregnancyIntentionId"),
						new Object[] { pregnancyIntention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyIntentionStatusCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionStatusCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_INTENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyIntentionStatusCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionStatusCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_INTENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyIntention The receiving '<em><b>Pregnancy Intention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyIntentionStatusCode(PregnancyIntention pregnancyIntention,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PregnancyIntentionPregnancyIntentionStatusCode", "ERROR");

		if (VALIDATE_PREGNANCY_INTENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_INTENTION);
			try {
				VALIDATE_PREGNANCY_INTENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_INTENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_INTENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pregnancyIntention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PREGNANCY_INTENTION__PREGNANCY_INTENTION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("PregnancyIntentionPregnancyIntentionStatusCode"),
						new Object[] { pregnancyIntention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyIntentionStatusCodeP(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionStatusCodeP(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_INTENTION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyIntentionStatusCodeP(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionStatusCodeP(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_INTENTION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyIntention The receiving '<em><b>Pregnancy Intention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyIntentionStatusCodeP(PregnancyIntention pregnancyIntention,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PregnancyIntentionPregnancyIntentionStatusCodeP", "ERROR");

		if (VALIDATE_PREGNANCY_INTENTION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_INTENTION);
			try {
				VALIDATE_PREGNANCY_INTENTION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_INTENTION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_INTENTION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				pregnancyIntention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PREGNANCY_INTENTION__PREGNANCY_INTENTION_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("PregnancyIntentionPregnancyIntentionStatusCodeP"),
						new Object[] { pregnancyIntention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyIntentionValue(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionValue(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_INTENTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '454391000124108' or value.code = '454401000124105' or value.code = '454411000124108' or value.code = '454381000124105')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyIntentionValue(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionValue(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_INTENTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyIntention The receiving '<em><b>Pregnancy Intention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyIntentionValue(PregnancyIntention pregnancyIntention,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PregnancyIntentionPregnancyIntentionValue", "ERROR");

		if (VALIDATE_PREGNANCY_INTENTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_INTENTION);
			try {
				VALIDATE_PREGNANCY_INTENTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_INTENTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PREGNANCY_INTENTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			pregnancyIntention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PREGNANCY_INTENTION__PREGNANCY_INTENTION_VALUE,
						ConsolPlugin.INSTANCE.getString("PregnancyIntentionPregnancyIntentionValue"),
						new Object[] { pregnancyIntention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyIntentionValueP(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionValueP(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_INTENTION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyIntentionValueP(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionValueP(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_INTENTION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyIntention The receiving '<em><b>Pregnancy Intention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyIntentionValueP(PregnancyIntention pregnancyIntention,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PregnancyIntentionPregnancyIntentionValueP", "ERROR");

		if (VALIDATE_PREGNANCY_INTENTION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_INTENTION);
			try {
				VALIDATE_PREGNANCY_INTENTION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_INTENTION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_INTENTION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pregnancyIntention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PREGNANCY_INTENTION__PREGNANCY_INTENTION_VALUE_P,
						ConsolPlugin.INSTANCE.getString("PregnancyIntentionPregnancyIntentionValueP"),
						new Object[] { pregnancyIntention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyIntentionClassCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionClassCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_INTENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyIntentionClassCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionClassCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_INTENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyIntention The receiving '<em><b>Pregnancy Intention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyIntentionClassCode(PregnancyIntention pregnancyIntention,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PregnancyIntentionPregnancyIntentionClassCode", "ERROR");

		if (VALIDATE_PREGNANCY_INTENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_INTENTION);
			try {
				VALIDATE_PREGNANCY_INTENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_INTENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_INTENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pregnancyIntention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PREGNANCY_INTENTION__PREGNANCY_INTENTION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("PregnancyIntentionPregnancyIntentionClassCode"),
						new Object[] { pregnancyIntention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyIntentionMoodCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionMoodCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_INTENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyIntentionMoodCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionMoodCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_INTENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyIntention The receiving '<em><b>Pregnancy Intention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyIntentionMoodCode(PregnancyIntention pregnancyIntention,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PregnancyIntentionPregnancyIntentionMoodCode", "ERROR");

		if (VALIDATE_PREGNANCY_INTENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_INTENTION);
			try {
				VALIDATE_PREGNANCY_INTENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_INTENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_INTENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pregnancyIntention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PREGNANCY_INTENTION__PREGNANCY_INTENTION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("PregnancyIntentionPregnancyIntentionMoodCode"),
						new Object[] { pregnancyIntention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyIntentionCodeP(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionCodeP(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_INTENTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyIntentionCodeP(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionCodeP(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_INTENTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyIntention The receiving '<em><b>Pregnancy Intention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyIntentionCodeP(PregnancyIntention pregnancyIntention,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PregnancyIntentionPregnancyIntentionCodeP", "ERROR");

		if (VALIDATE_PREGNANCY_INTENTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_INTENTION);
			try {
				VALIDATE_PREGNANCY_INTENTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_INTENTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_INTENTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pregnancyIntention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PREGNANCY_INTENTION__PREGNANCY_INTENTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("PregnancyIntentionPregnancyIntentionCodeP"),
						new Object[] { pregnancyIntention }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.PregnancyIntentionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PregnancyIntentionCodeP", passToken);
				}
				passToken.add(pregnancyIntention);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyIntentionCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_INTENTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '86645-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyIntentionCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionCode(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_INTENTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyIntention The receiving '<em><b>Pregnancy Intention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyIntentionCode(PregnancyIntention pregnancyIntention,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PregnancyIntentionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(pregnancyIntention)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "PregnancyIntentionPregnancyIntentionCode", "ERROR");

		if (VALIDATE_PREGNANCY_INTENTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_INTENTION);
			try {
				VALIDATE_PREGNANCY_INTENTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_INTENTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PREGNANCY_INTENTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			pregnancyIntention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PREGNANCY_INTENTION__PREGNANCY_INTENTION_CODE,
						ConsolPlugin.INSTANCE.getString("PregnancyIntentionPregnancyIntentionCode"),
						new Object[] { pregnancyIntention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyIntentionEffectiveTime(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionEffectiveTime(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_INTENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyIntentionEffectiveTime(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionEffectiveTime(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_INTENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyIntention The receiving '<em><b>Pregnancy Intention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePregnancyIntentionEffectiveTime(PregnancyIntention pregnancyIntention,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PregnancyIntentionPregnancyIntentionEffectiveTime", "ERROR");

		if (VALIDATE_PREGNANCY_INTENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_INTENTION);
			try {
				VALIDATE_PREGNANCY_INTENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PREGNANCY_INTENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_INTENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				pregnancyIntention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PREGNANCY_INTENTION__PREGNANCY_INTENTION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("PregnancyIntentionPregnancyIntentionEffectiveTime"),
						new Object[] { pregnancyIntention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyIntentionIVLTSLow(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionIVLTSLow(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_INTENTION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyIntentionIVLTSLow(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionIVLTSLow(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PREGNANCY_INTENTION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyIntention The receiving '<em><b>Pregnancy Intention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePregnancyIntentionIVLTSLow(PregnancyIntention pregnancyIntention,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PregnancyIntentionPregnancyIntentionIVLTSLow", "ERROR");

		if (VALIDATE_PREGNANCY_INTENTION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_INTENTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PREGNANCY_INTENTION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PREGNANCY_INTENTION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PREGNANCY_INTENTION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			pregnancyIntention);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PREGNANCY_INTENTION__PREGNANCY_INTENTION_IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString("PregnancyIntentionPregnancyIntentionIVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyIntentionIVLTSHigh(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionIVLTSHigh(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_INTENTION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyIntentionIVLTSHigh(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyIntentionIVLTSHigh(PregnancyIntention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PREGNANCY_INTENTION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	protected static final String VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyIntention The receiving '<em><b>Pregnancy Intention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validatePregnancyIntentionIVLTSHigh(PregnancyIntention pregnancyIntention,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PregnancyIntentionPregnancyIntentionIVLTSHigh", "ERROR");

		if (VALIDATE_PREGNANCY_INTENTION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PREGNANCY_INTENTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PREGNANCY_INTENTION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PREGNANCY_INTENTION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PREGNANCY_INTENTION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			pregnancyIntention);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PREGNANCY_INTENTION__PREGNANCY_INTENTION_IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString("PregnancyIntentionPregnancyIntentionIVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // PregnancyIntentionOperations
