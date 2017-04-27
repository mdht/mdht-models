/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesPositive;
import org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesRemovedandExamined;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Lymph Node Sampling Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer#validateLymphNodeSamplingResultOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer#validateLymphNodeSamplingResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer#validateLymphNodeSamplingResultOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer#validateLymphNodeSamplingResultOrganizerStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer#validateLymphNodeSamplingResultOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer#validateLymphNodeSamplingResultOrganizerNumberofLymphNodesRemovedandExamined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Numberof Lymph Nodes Removedand Examined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer#validateLymphNodeSamplingResultOrganizerNumberofLymphNodesPositive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Numberof Lymph Nodes Positive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer#validateLymphNodeSamplingResultOrganizerReferenceExternalDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Reference External Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer#validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRolePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Specimen Specimen Role Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer#validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Specimen Specimen Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer#validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleSpecimenPlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Specimen Specimen Role Specimen Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer#getNumberofLymphNodesRemovedandExamined() <em>Get Numberof Lymph Nodes Removedand Examined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer#getNumberofLymphNodesPositive() <em>Get Numberof Lymph Nodes Positive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LymphNodeSamplingResultOrganizerOperations extends ResultOrganizerOperations {
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
	protected LymphNodeSamplingResultOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLymphNodeSamplingResultOrganizerClassCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerClassCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateLymphNodeSamplingResultOrganizerClassCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerClassCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lymphNodeSamplingResultOrganizer The receiving '<em><b>Lymph Node Sampling Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLymphNodeSamplingResultOrganizerClassCode(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer());
			try {
				VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lymphNodeSamplingResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LymphNodeSamplingResultOrganizerLymphNodeSamplingResultOrganizerClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lymphNodeSamplingResultOrganizer, context) }),
						new Object[] { lymphNodeSamplingResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLymphNodeSamplingResultOrganizerCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLymphNodeSamplingResultOrganizerCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lymphNodeSamplingResultOrganizer The receiving '<em><b>Lymph Node Sampling Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLymphNodeSamplingResultOrganizerCode(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer());
			try {
				VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lymphNodeSamplingResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LymphNodeSamplingResultOrganizerLymphNodeSamplingResultOrganizerCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lymphNodeSamplingResultOrganizer, context) }),
						new Object[] { lymphNodeSamplingResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLymphNodeSamplingResultOrganizerEffectiveTime(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerEffectiveTime(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLymphNodeSamplingResultOrganizerEffectiveTime(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerEffectiveTime(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lymphNodeSamplingResultOrganizer The receiving '<em><b>Lymph Node Sampling Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLymphNodeSamplingResultOrganizerEffectiveTime(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer());
			try {
				VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lymphNodeSamplingResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LymphNodeSamplingResultOrganizerLymphNodeSamplingResultOrganizerEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lymphNodeSamplingResultOrganizer, context) }),
						new Object[] { lymphNodeSamplingResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLymphNodeSamplingResultOrganizerStatusCodeP(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerStatusCodeP(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLymphNodeSamplingResultOrganizerStatusCodeP(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerStatusCodeP(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lymphNodeSamplingResultOrganizer The receiving '<em><b>Lymph Node Sampling Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLymphNodeSamplingResultOrganizerStatusCodeP(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer());
			try {
				VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lymphNodeSamplingResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LymphNodeSamplingResultOrganizerLymphNodeSamplingResultOrganizerStatusCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lymphNodeSamplingResultOrganizer, context) }),
						new Object[] { lymphNodeSamplingResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLymphNodeSamplingResultOrganizerStatusCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerStatusCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " +
			"value.code = 'aborted' or value.code = 'active' or value.code = 'cancelled' or value.code = 'completed' or value.code = 'held' or value.code = 'suspended')";

	/**
	 * The cached OCL invariant for the '{@link #validateLymphNodeSamplingResultOrganizerStatusCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerStatusCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lymphNodeSamplingResultOrganizer The receiving '<em><b>Lymph Node Sampling Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLymphNodeSamplingResultOrganizerStatusCode(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer());
			try {
				VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lymphNodeSamplingResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LymphNodeSamplingResultOrganizerLymphNodeSamplingResultOrganizerStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lymphNodeSamplingResultOrganizer, context) }),
						new Object[] { lymphNodeSamplingResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLymphNodeSamplingResultOrganizerNumberofLymphNodesRemovedandExamined(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Numberof Lymph Nodes Removedand Examined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerNumberofLymphNodesRemovedandExamined(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(clondata::NumberofLymphNodesRemovedandExamined))";

	/**
	 * The cached OCL invariant for the '{@link #validateLymphNodeSamplingResultOrganizerNumberofLymphNodesRemovedandExamined(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Numberof Lymph Nodes Removedand Examined</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerNumberofLymphNodesRemovedandExamined(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lymphNodeSamplingResultOrganizer The receiving '<em><b>Lymph Node Sampling Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLymphNodeSamplingResultOrganizerNumberofLymphNodesRemovedandExamined(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer());
			try {
				VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lymphNodeSamplingResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LymphNodeSamplingResultOrganizerLymphNodeSamplingResultOrganizerNumberofLymphNodesRemovedandExamined",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lymphNodeSamplingResultOrganizer, context) }),
						new Object[] { lymphNodeSamplingResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLymphNodeSamplingResultOrganizerNumberofLymphNodesPositive(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Numberof Lymph Nodes Positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerNumberofLymphNodesPositive(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_POSITIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(clondata::NumberofLymphNodesPositive))";

	/**
	 * The cached OCL invariant for the '{@link #validateLymphNodeSamplingResultOrganizerNumberofLymphNodesPositive(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Numberof Lymph Nodes Positive</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerNumberofLymphNodesPositive(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_POSITIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lymphNodeSamplingResultOrganizer The receiving '<em><b>Lymph Node Sampling Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLymphNodeSamplingResultOrganizerNumberofLymphNodesPositive(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_POSITIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer());
			try {
				VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_POSITIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_POSITIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_POSITIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lymphNodeSamplingResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_POSITIVE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LymphNodeSamplingResultOrganizerLymphNodeSamplingResultOrganizerNumberofLymphNodesPositive",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lymphNodeSamplingResultOrganizer, context) }),
						new Object[] { lymphNodeSamplingResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLymphNodeSamplingResultOrganizerReferenceExternalDocumentCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Reference External Document Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerReferenceExternalDocumentCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_REFERENCE_EXTERNAL_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalDocument->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = code.oclAsType(datatypes::CD) in " +
			"value.code = '34122-2' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateLymphNodeSamplingResultOrganizerReferenceExternalDocumentCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Reference External Document Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerReferenceExternalDocumentCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_REFERENCE_EXTERNAL_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lymphNodeSamplingResultOrganizer The receiving '<em><b>Lymph Node Sampling Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLymphNodeSamplingResultOrganizerReferenceExternalDocumentCode(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_REFERENCE_EXTERNAL_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer());
			try {
				VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_REFERENCE_EXTERNAL_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_REFERENCE_EXTERNAL_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_REFERENCE_EXTERNAL_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lymphNodeSamplingResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_REFERENCE_EXTERNAL_DOCUMENT_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LymphNodeSamplingResultOrganizerLymphNodeSamplingResultOrganizerReferenceExternalDocumentCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lymphNodeSamplingResultOrganizer, context) }),
						new Object[] { lymphNodeSamplingResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRolePlayingEntityCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Specimen Specimen Role Playing Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRolePlayingEntityCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null).specimenRole->excluding(null).specimenPlayingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRolePlayingEntityCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Specimen Specimen Role Playing Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRolePlayingEntityCode(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lymphNodeSamplingResultOrganizer The receiving '<em><b>Lymph Node Sampling Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRolePlayingEntityCode(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer());
			try {
				VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lymphNodeSamplingResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LymphNodeSamplingResultOrganizerLymphNodeSamplingResultOrganizerSpecimenSpecimenRolePlayingEntityCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lymphNodeSamplingResultOrganizer, context) }),
						new Object[] { lymphNodeSamplingResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleId(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Specimen Specimen Role Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleId(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null).specimenRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleId(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Specimen Specimen Role Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleId(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lymphNodeSamplingResultOrganizer The receiving '<em><b>Lymph Node Sampling Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleId(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer());
			try {
				VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lymphNodeSamplingResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LymphNodeSamplingResultOrganizerLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lymphNodeSamplingResultOrganizer, context) }),
						new Object[] { lymphNodeSamplingResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleSpecimenPlayingEntity(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Specimen Specimen Role Specimen Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleSpecimenPlayingEntity(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null).specimenRole->excluding(null)->reject(specimenPlayingEntity->one(specimenPlayingEntity : cda::PlayingEntity | not specimenPlayingEntity.oclIsUndefined() and specimenPlayingEntity.oclIsKindOf(cda::PlayingEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleSpecimenPlayingEntity(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lymph Node Sampling Result Organizer Specimen Specimen Role Specimen Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleSpecimenPlayingEntity(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lymphNodeSamplingResultOrganizer The receiving '<em><b>Lymph Node Sampling Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleSpecimenPlayingEntity(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer());
			try {
				VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lymphNodeSamplingResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LymphNodeSamplingResultOrganizerLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleSpecimenPlayingEntity",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lymphNodeSamplingResultOrganizer, context) }),
						new Object[] { lymphNodeSamplingResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNumberofLymphNodesRemovedandExamined(LymphNodeSamplingResultOrganizer) <em>Get Numberof Lymph Nodes Removedand Examined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberofLymphNodesRemovedandExamined(LymphNodeSamplingResultOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::NumberofLymphNodesRemovedandExamined))->asSequence()->any(true).oclAsType(clondata::NumberofLymphNodesRemovedandExamined)";

	/**
	 * The cached OCL query for the '{@link #getNumberofLymphNodesRemovedandExamined(LymphNodeSamplingResultOrganizer) <em>Get Numberof Lymph Nodes Removedand Examined</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberofLymphNodesRemovedandExamined(LymphNodeSamplingResultOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static NumberofLymphNodesRemovedandExamined getNumberofLymphNodesRemovedandExamined(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer) {

		if (GET_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer(),
				CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer().getEAllOperations().get(74));
			try {
				GET_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__EOCL_QRY = helper.createQuery(
					GET_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__EOCL_QRY);
		return (NumberofLymphNodesRemovedandExamined) query.evaluate(lymphNodeSamplingResultOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNumberofLymphNodesPositive(LymphNodeSamplingResultOrganizer) <em>Get Numberof Lymph Nodes Positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberofLymphNodesPositive(LymphNodeSamplingResultOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUMBEROF_LYMPH_NODES_POSITIVE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::NumberofLymphNodesPositive))->asSequence()->any(true).oclAsType(clondata::NumberofLymphNodesPositive)";

	/**
	 * The cached OCL query for the '{@link #getNumberofLymphNodesPositive(LymphNodeSamplingResultOrganizer) <em>Get Numberof Lymph Nodes Positive</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberofLymphNodesPositive(LymphNodeSamplingResultOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUMBEROF_LYMPH_NODES_POSITIVE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static NumberofLymphNodesPositive getNumberofLymphNodesPositive(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer) {

		if (GET_NUMBEROF_LYMPH_NODES_POSITIVE__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer(),
				CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer().getEAllOperations().get(75));
			try {
				GET_NUMBEROF_LYMPH_NODES_POSITIVE__EOCL_QRY = helper.createQuery(
					GET_NUMBEROF_LYMPH_NODES_POSITIVE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_NUMBEROF_LYMPH_NODES_POSITIVE__EOCL_QRY);
		return (NumberofLymphNodesPositive) query.evaluate(lymphNodeSamplingResultOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerTemplateId(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerTemplateId(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(LymphNodeSamplingResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lymphNodeSamplingResultOrganizer The receiving '<em><b>Lymph Node Sampling Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizerTemplateId(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getLymphNodeSamplingResultOrganizer());
			try {
				VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lymphNodeSamplingResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LymphNodeSamplingResultOrganizerResultOrganizerTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										lymphNodeSamplingResultOrganizer, context) }),
						new Object[] { lymphNodeSamplingResultOrganizer }));
			}

			return false;
		}
		return true;
	}

} // LymphNodeSamplingResultOrganizerOperations
