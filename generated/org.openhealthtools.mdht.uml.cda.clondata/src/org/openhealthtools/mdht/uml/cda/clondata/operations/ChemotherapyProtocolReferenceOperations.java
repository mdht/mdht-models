/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Chemotherapy Protocol Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference#validateChemotherapyProtocolReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference#validateChemotherapyProtocolReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference#validateChemotherapyProtocolReferenceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference#validateChemotherapyProtocolReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference#validateChemotherapyProtocolReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference#validateChemotherapyProtocolReferenceStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference#validateChemotherapyProtocolReferenceStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference#validateChemotherapyProtocolReferenceReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference#validateChemotherapyProtocolReferenceReferenceExternalDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Reference External Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference#validateChemotherapyProtocolReferenceReferenceExternalDocumentText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Reference External Document Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference#validateChemotherapyProtocolReferenceReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference#validateChemotherapyProtocolReferenceReferenceExternalDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Reference External Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChemotherapyProtocolReferenceOperations extends ClinicalStatementOperations {
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
	protected ChemotherapyProtocolReferenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyProtocolReferenceTemplateId(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceTemplateId(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.50')";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyProtocolReferenceTemplateId(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceTemplateId(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyProtocolReference The receiving '<em><b>Chemotherapy Protocol Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyProtocolReferenceTemplateId(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyProtocolReference());
			try {
				VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyProtocolReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyProtocolReferenceChemotherapyProtocolReferenceTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyProtocolReference, context) }),
						new Object[] { chemotherapyProtocolReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyProtocolReferenceClassCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceClassCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyProtocolReferenceClassCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceClassCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyProtocolReference The receiving '<em><b>Chemotherapy Protocol Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyProtocolReferenceClassCode(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyProtocolReference());
			try {
				VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyProtocolReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyProtocolReferenceChemotherapyProtocolReferenceClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyProtocolReference, context) }),
						new Object[] { chemotherapyProtocolReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyProtocolReferenceCodeP(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceCodeP(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyProtocolReferenceCodeP(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceCodeP(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyProtocolReference The receiving '<em><b>Chemotherapy Protocol Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyProtocolReferenceCodeP(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyProtocolReference());
			try {
				VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyProtocolReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyProtocolReferenceChemotherapyProtocolReferenceCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyProtocolReference, context) }),
						new Object[] { chemotherapyProtocolReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyProtocolReferenceCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '69960004' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyProtocolReferenceCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyProtocolReference The receiving '<em><b>Chemotherapy Protocol Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyProtocolReferenceCode(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyProtocolReference());
			try {
				VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyProtocolReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyProtocolReferenceChemotherapyProtocolReferenceCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyProtocolReference, context) }),
						new Object[] { chemotherapyProtocolReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyProtocolReferenceMoodCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceMoodCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyProtocolReferenceMoodCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceMoodCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyProtocolReference The receiving '<em><b>Chemotherapy Protocol Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyProtocolReferenceMoodCode(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyProtocolReference());
			try {
				VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyProtocolReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyProtocolReferenceChemotherapyProtocolReferenceMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyProtocolReference, context) }),
						new Object[] { chemotherapyProtocolReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyProtocolReference The receiving '<em><b>Chemotherapy Protocol Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyProtocolReferenceStatusCodeP(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyProtocolReference());
			try {
				VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyProtocolReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyProtocolReferenceChemotherapyProtocolReferenceStatusCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyProtocolReference, context) }),
						new Object[] { chemotherapyProtocolReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyProtocolReferenceStatusCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceStatusCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyProtocolReferenceStatusCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceStatusCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyProtocolReferenceStatusCodeP(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceStatusCodeP(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyProtocolReferenceStatusCodeP(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceStatusCodeP(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyProtocolReference The receiving '<em><b>Chemotherapy Protocol Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyProtocolReferenceStatusCode(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyProtocolReference());
			try {
				VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyProtocolReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyProtocolReferenceChemotherapyProtocolReferenceStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyProtocolReference, context) }),
						new Object[] { chemotherapyProtocolReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyProtocolReferenceReference(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceReference(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->one(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyProtocolReferenceReference(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceReference(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyProtocolReference The receiving '<em><b>Chemotherapy Protocol Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyProtocolReferenceReference(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyProtocolReference());
			try {
				VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyProtocolReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyProtocolReferenceChemotherapyProtocolReferenceReference",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyProtocolReference, context) }),
						new Object[] { chemotherapyProtocolReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyProtocolReferenceReferenceExternalDocumentId(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Reference External Document Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceReferenceExternalDocumentId(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalDocument->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyProtocolReferenceReferenceExternalDocumentId(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Reference External Document Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceReferenceExternalDocumentId(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyProtocolReference The receiving '<em><b>Chemotherapy Protocol Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyProtocolReferenceReferenceExternalDocumentId(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyProtocolReference());
			try {
				VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyProtocolReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyProtocolReferenceChemotherapyProtocolReferenceReferenceExternalDocumentId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyProtocolReference, context) }),
						new Object[] { chemotherapyProtocolReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyProtocolReferenceReferenceExternalDocumentText(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Reference External Document Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceReferenceExternalDocumentText(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalDocument->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyProtocolReferenceReferenceExternalDocumentText(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Reference External Document Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceReferenceExternalDocumentText(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyProtocolReference The receiving '<em><b>Chemotherapy Protocol Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyProtocolReferenceReferenceExternalDocumentText(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyProtocolReference());
			try {
				VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyProtocolReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_TEXT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyProtocolReferenceChemotherapyProtocolReferenceReferenceExternalDocumentText",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyProtocolReference, context) }),
						new Object[] { chemotherapyProtocolReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyProtocolReferenceReferenceTypeCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceReferenceTypeCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyProtocolReferenceReferenceTypeCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceReferenceTypeCode(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyProtocolReference The receiving '<em><b>Chemotherapy Protocol Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyProtocolReferenceReferenceTypeCode(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyProtocolReference());
			try {
				VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyProtocolReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_TYPE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyProtocolReferenceChemotherapyProtocolReferenceReferenceTypeCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyProtocolReference, context) }),
						new Object[] { chemotherapyProtocolReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyProtocolReferenceReferenceExternalDocument(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Reference External Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceReferenceExternalDocument(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(cda::ExternalDocument)))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyProtocolReferenceReferenceExternalDocument(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Protocol Reference Reference External Document</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyProtocolReferenceReferenceExternalDocument(ChemotherapyProtocolReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyProtocolReference The receiving '<em><b>Chemotherapy Protocol Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyProtocolReferenceReferenceExternalDocument(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyProtocolReference());
			try {
				VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyProtocolReference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyProtocolReferenceChemotherapyProtocolReferenceReferenceExternalDocument",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyProtocolReference, context) }),
						new Object[] { chemotherapyProtocolReference }));
			}

			return false;
		}
		return true;
	}

} // ChemotherapyProtocolReferenceOperations
