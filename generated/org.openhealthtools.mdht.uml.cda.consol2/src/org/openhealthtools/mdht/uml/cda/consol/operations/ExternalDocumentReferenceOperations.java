/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ExternalDocumentOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>External Document Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Version Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalDocumentReferenceOperations extends ExternalDocumentOperations {
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
	protected ExternalDocumentReferenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceTemplateId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceTemplateId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.115')";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceTemplateId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceTemplateId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExternalDocumentReferenceTemplateId(
			ExternalDocumentReference externalDocumentReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				externalDocumentReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceTemplateId"),
						new Object[] { externalDocumentReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceClassCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceClassCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClassDocument::DOCCLIN";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceClassCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceClassCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExternalDocumentReferenceClassCode(
			ExternalDocumentReference externalDocumentReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				externalDocumentReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceClassCode"),
						new Object[] { externalDocumentReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceMoodCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceMoodCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceMoodCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceMoodCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExternalDocumentReferenceMoodCode(ExternalDocumentReference externalDocumentReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				externalDocumentReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceMoodCode"),
						new Object[] { externalDocumentReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() =  1)";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExternalDocumentReferenceId(ExternalDocumentReference externalDocumentReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				externalDocumentReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_ID,
						ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceId"),
						new Object[] { externalDocumentReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExternalDocumentReferenceCode(ExternalDocumentReference externalDocumentReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				externalDocumentReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_CODE,
						ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceCode"),
						new Object[] { externalDocumentReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceSetId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Set Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceSetId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceSetId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Set Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceSetId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExternalDocumentReferenceSetId(ExternalDocumentReference externalDocumentReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				externalDocumentReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_SET_ID,
						ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceSetId"),
						new Object[] { externalDocumentReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceVersionNumber(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceVersionNumber(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceVersionNumber(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceVersionNumber(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExternalDocumentReferenceVersionNumber(
			ExternalDocumentReference externalDocumentReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				externalDocumentReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_VERSION_NUMBER,
						ConsolPlugin.INSTANCE.getString(
							"ExternalDocumentReferenceExternalDocumentReferenceVersionNumber"),
						new Object[] { externalDocumentReference }));
			}

			return false;
		}
		return true;
	}

} // ExternalDocumentReferenceOperations
