/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesPositive;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Numberof Lymph Nodes Positive</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesPositive#validateNumberofLymphNodesPositiveCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Positive Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesPositive#validateNumberofLymphNodesPositiveCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Positive Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesPositive#validateNumberofLymphNodesPositiveValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Positive Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesPositive#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberofLymphNodesPositiveOperations extends ResultObservationOperations {
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
	protected NumberofLymphNodesPositiveOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofLymphNodesPositiveCodeP(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Positive Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLymphNodesPositiveCodeP(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofLymphNodesPositiveCodeP(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Positive Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLymphNodesPositiveCodeP(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofLymphNodesPositive The receiving '<em><b>Numberof Lymph Nodes Positive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofLymphNodesPositiveCodeP(NumberofLymphNodesPositive numberofLymphNodesPositive,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNumberofLymphNodesPositive());
			try {
				VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberofLymphNodesPositive)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NUMBEROF_LYMPH_NODES_POSITIVE__NUMBEROF_LYMPH_NODES_POSITIVE_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NumberofLymphNodesPositiveNumberofLymphNodesPositiveCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										numberofLymphNodesPositive, context) }),
						new Object[] { numberofLymphNodesPositive }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofLymphNodesPositiveCode(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Positive Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLymphNodesPositiveCode(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '44622-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofLymphNodesPositiveCode(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Positive Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLymphNodesPositiveCode(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofLymphNodesPositive The receiving '<em><b>Numberof Lymph Nodes Positive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofLymphNodesPositiveCode(NumberofLymphNodesPositive numberofLymphNodesPositive,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNumberofLymphNodesPositive());
			try {
				VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberofLymphNodesPositive)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NUMBEROF_LYMPH_NODES_POSITIVE__NUMBEROF_LYMPH_NODES_POSITIVE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NumberofLymphNodesPositiveNumberofLymphNodesPositiveCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										numberofLymphNodesPositive, context) }),
						new Object[] { numberofLymphNodesPositive }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofLymphNodesPositiveValue(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Positive Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLymphNodesPositiveValue(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofLymphNodesPositiveValue(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Positive Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLymphNodesPositiveValue(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofLymphNodesPositive The receiving '<em><b>Numberof Lymph Nodes Positive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofLymphNodesPositiveValue(NumberofLymphNodesPositive numberofLymphNodesPositive,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNumberofLymphNodesPositive());
			try {
				VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBEROF_LYMPH_NODES_POSITIVE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberofLymphNodesPositive)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NUMBEROF_LYMPH_NODES_POSITIVE__NUMBEROF_LYMPH_NODES_POSITIVE_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NumberofLymphNodesPositiveNumberofLymphNodesPositiveValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										numberofLymphNodesPositive, context) }),
						new Object[] { numberofLymphNodesPositive }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationTemplateId(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.15')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationTemplateId(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(NumberofLymphNodesPositive, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofLymphNodesPositive The receiving '<em><b>Numberof Lymph Nodes Positive</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultObservationTemplateId(NumberofLymphNodesPositive numberofLymphNodesPositive,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNumberofLymphNodesPositive());
			try {
				VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberofLymphNodesPositive)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NUMBEROF_LYMPH_NODES_POSITIVE__RESULT_OBSERVATION_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NumberofLymphNodesPositiveResultObservationTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										numberofLymphNodesPositive, context) }),
						new Object[] { numberofLymphNodesPositive }));
			}

			return false;
		}
		return true;
	}

} // NumberofLymphNodesPositiveOperations
