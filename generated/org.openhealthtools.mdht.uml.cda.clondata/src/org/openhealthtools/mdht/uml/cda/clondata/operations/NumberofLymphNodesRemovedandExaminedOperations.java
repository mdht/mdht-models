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
import org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesRemovedandExamined;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Numberof Lymph Nodes Removedand Examined</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesRemovedandExamined#validateNumberofLymphNodesRemovedandExaminedCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Removedand Examined Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesRemovedandExamined#validateNumberofLymphNodesRemovedandExaminedCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Removedand Examined Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesRemovedandExamined#validateNumberofLymphNodesRemovedandExaminedValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Removedand Examined Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesRemovedandExamined#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberofLymphNodesRemovedandExaminedOperations extends ResultObservationOperations {
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
	protected NumberofLymphNodesRemovedandExaminedOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofLymphNodesRemovedandExaminedCodeP(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Removedand Examined Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLymphNodesRemovedandExaminedCodeP(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofLymphNodesRemovedandExaminedCodeP(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Removedand Examined Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLymphNodesRemovedandExaminedCodeP(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofLymphNodesRemovedandExamined The receiving '<em><b>Numberof Lymph Nodes Removedand Examined</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofLymphNodesRemovedandExaminedCodeP(
			NumberofLymphNodesRemovedandExamined numberofLymphNodesRemovedandExamined, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNumberofLymphNodesRemovedandExamined());
			try {
				VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberofLymphNodesRemovedandExamined)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NumberofLymphNodesRemovedandExaminedNumberofLymphNodesRemovedandExaminedCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										numberofLymphNodesRemovedandExamined, context) }),
						new Object[] { numberofLymphNodesRemovedandExamined }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofLymphNodesRemovedandExaminedCode(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Removedand Examined Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLymphNodesRemovedandExaminedCode(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '44621-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofLymphNodesRemovedandExaminedCode(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Removedand Examined Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLymphNodesRemovedandExaminedCode(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofLymphNodesRemovedandExamined The receiving '<em><b>Numberof Lymph Nodes Removedand Examined</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofLymphNodesRemovedandExaminedCode(
			NumberofLymphNodesRemovedandExamined numberofLymphNodesRemovedandExamined, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNumberofLymphNodesRemovedandExamined());
			try {
				VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberofLymphNodesRemovedandExamined)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NumberofLymphNodesRemovedandExaminedNumberofLymphNodesRemovedandExaminedCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										numberofLymphNodesRemovedandExamined, context) }),
						new Object[] { numberofLymphNodesRemovedandExamined }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberofLymphNodesRemovedandExaminedValue(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Removedand Examined Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLymphNodesRemovedandExaminedValue(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberofLymphNodesRemovedandExaminedValue(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Lymph Nodes Removedand Examined Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberofLymphNodesRemovedandExaminedValue(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofLymphNodesRemovedandExamined The receiving '<em><b>Numberof Lymph Nodes Removedand Examined</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberofLymphNodesRemovedandExaminedValue(
			NumberofLymphNodesRemovedandExamined numberofLymphNodesRemovedandExamined, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNumberofLymphNodesRemovedandExamined());
			try {
				VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberofLymphNodesRemovedandExamined)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NumberofLymphNodesRemovedandExaminedNumberofLymphNodesRemovedandExaminedValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										numberofLymphNodesRemovedandExamined, context) }),
						new Object[] { numberofLymphNodesRemovedandExamined }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationTemplateId(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationTemplateId(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(NumberofLymphNodesRemovedandExamined, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberofLymphNodesRemovedandExamined The receiving '<em><b>Numberof Lymph Nodes Removedand Examined</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultObservationTemplateId(
			NumberofLymphNodesRemovedandExamined numberofLymphNodesRemovedandExamined, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNumberofLymphNodesRemovedandExamined());
			try {
				VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				numberofLymphNodesRemovedandExamined)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__RESULT_OBSERVATION_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NumberofLymphNodesRemovedandExaminedResultObservationTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										numberofLymphNodesRemovedandExamined, context) }),
						new Object[] { numberofLymphNodesRemovedandExamined }));
			}

			return false;
		}
		return true;
	}

} // NumberofLymphNodesRemovedandExaminedOperations
