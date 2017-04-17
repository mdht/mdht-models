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
import org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.HER2ReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.ProgesteroneReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Receptor Status Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer#validateReceptorStatusOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Receptor Status Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer#validateReceptorStatusOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Receptor Status Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer#validateReceptorStatusOrganizerEstrogenReceptorStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Receptor Status Organizer Estrogen Receptor Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer#validateReceptorStatusOrganizerProgesteroneReceptorStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Receptor Status Organizer Progesterone Receptor Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer#validateReceptorStatusOrganizerHER2ReceptorStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Receptor Status Organizer HER2 Receptor Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer#getEstrogenReceptorStatus() <em>Get Estrogen Receptor Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer#getProgesteroneReceptorStatus() <em>Get Progesterone Receptor Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer#getHER2ReceptorStatus() <em>Get HER2 Receptor Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceptorStatusOrganizerOperations extends ResultOrganizerOperations {
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
	protected ReceptorStatusOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReceptorStatusOrganizerCodeP(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Receptor Status Organizer Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReceptorStatusOrganizerCodeP(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RECEPTOR_STATUS_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReceptorStatusOrganizerCodeP(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Receptor Status Organizer Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReceptorStatusOrganizerCodeP(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RECEPTOR_STATUS_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param receptorStatusOrganizer The receiving '<em><b>Receptor Status Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReceptorStatusOrganizerCodeP(ReceptorStatusOrganizer receptorStatusOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RECEPTOR_STATUS_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getReceptorStatusOrganizer());
			try {
				VALIDATE_RECEPTOR_STATUS_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_RECEPTOR_STATUS_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RECEPTOR_STATUS_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				receptorStatusOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.RECEPTOR_STATUS_ORGANIZER__RECEPTOR_STATUS_ORGANIZER_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ReceptorStatusOrganizerReceptorStatusOrganizerCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										receptorStatusOrganizer, context) }),
						new Object[] { receptorStatusOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReceptorStatusOrganizerCode(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Receptor Status Organizer Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReceptorStatusOrganizerCode(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RECEPTOR_STATUS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '246113000' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateReceptorStatusOrganizerCode(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Receptor Status Organizer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReceptorStatusOrganizerCode(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RECEPTOR_STATUS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param receptorStatusOrganizer The receiving '<em><b>Receptor Status Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReceptorStatusOrganizerCode(ReceptorStatusOrganizer receptorStatusOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RECEPTOR_STATUS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getReceptorStatusOrganizer());
			try {
				VALIDATE_RECEPTOR_STATUS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_RECEPTOR_STATUS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RECEPTOR_STATUS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				receptorStatusOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.RECEPTOR_STATUS_ORGANIZER__RECEPTOR_STATUS_ORGANIZER_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ReceptorStatusOrganizerReceptorStatusOrganizerCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										receptorStatusOrganizer, context) }),
						new Object[] { receptorStatusOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReceptorStatusOrganizerEstrogenReceptorStatus(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Receptor Status Organizer Estrogen Receptor Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReceptorStatusOrganizerEstrogenReceptorStatus(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RECEPTOR_STATUS_ORGANIZER_ESTROGEN_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(clondata::EstrogenReceptorStatus))";

	/**
	 * The cached OCL invariant for the '{@link #validateReceptorStatusOrganizerEstrogenReceptorStatus(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Receptor Status Organizer Estrogen Receptor Status</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReceptorStatusOrganizerEstrogenReceptorStatus(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RECEPTOR_STATUS_ORGANIZER_ESTROGEN_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param receptorStatusOrganizer The receiving '<em><b>Receptor Status Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReceptorStatusOrganizerEstrogenReceptorStatus(
			ReceptorStatusOrganizer receptorStatusOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RECEPTOR_STATUS_ORGANIZER_ESTROGEN_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getReceptorStatusOrganizer());
			try {
				VALIDATE_RECEPTOR_STATUS_ORGANIZER_ESTROGEN_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_RECEPTOR_STATUS_ORGANIZER_ESTROGEN_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RECEPTOR_STATUS_ORGANIZER_ESTROGEN_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				receptorStatusOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.RECEPTOR_STATUS_ORGANIZER__RECEPTOR_STATUS_ORGANIZER_ESTROGEN_RECEPTOR_STATUS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ReceptorStatusOrganizerReceptorStatusOrganizerEstrogenReceptorStatus",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										receptorStatusOrganizer, context) }),
						new Object[] { receptorStatusOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReceptorStatusOrganizerProgesteroneReceptorStatus(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Receptor Status Organizer Progesterone Receptor Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReceptorStatusOrganizerProgesteroneReceptorStatus(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RECEPTOR_STATUS_ORGANIZER_PROGESTERONE_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(clondata::ProgesteroneReceptorStatus))";

	/**
	 * The cached OCL invariant for the '{@link #validateReceptorStatusOrganizerProgesteroneReceptorStatus(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Receptor Status Organizer Progesterone Receptor Status</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReceptorStatusOrganizerProgesteroneReceptorStatus(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RECEPTOR_STATUS_ORGANIZER_PROGESTERONE_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param receptorStatusOrganizer The receiving '<em><b>Receptor Status Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReceptorStatusOrganizerProgesteroneReceptorStatus(
			ReceptorStatusOrganizer receptorStatusOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RECEPTOR_STATUS_ORGANIZER_PROGESTERONE_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getReceptorStatusOrganizer());
			try {
				VALIDATE_RECEPTOR_STATUS_ORGANIZER_PROGESTERONE_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_RECEPTOR_STATUS_ORGANIZER_PROGESTERONE_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RECEPTOR_STATUS_ORGANIZER_PROGESTERONE_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				receptorStatusOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.RECEPTOR_STATUS_ORGANIZER__RECEPTOR_STATUS_ORGANIZER_PROGESTERONE_RECEPTOR_STATUS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ReceptorStatusOrganizerReceptorStatusOrganizerProgesteroneReceptorStatus",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										receptorStatusOrganizer, context) }),
						new Object[] { receptorStatusOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReceptorStatusOrganizerHER2ReceptorStatus(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Receptor Status Organizer HER2 Receptor Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReceptorStatusOrganizerHER2ReceptorStatus(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RECEPTOR_STATUS_ORGANIZER_HER2_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(clondata::HER2ReceptorStatus))";

	/**
	 * The cached OCL invariant for the '{@link #validateReceptorStatusOrganizerHER2ReceptorStatus(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Receptor Status Organizer HER2 Receptor Status</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReceptorStatusOrganizerHER2ReceptorStatus(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RECEPTOR_STATUS_ORGANIZER_HER2_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param receptorStatusOrganizer The receiving '<em><b>Receptor Status Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReceptorStatusOrganizerHER2ReceptorStatus(
			ReceptorStatusOrganizer receptorStatusOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RECEPTOR_STATUS_ORGANIZER_HER2_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getReceptorStatusOrganizer());
			try {
				VALIDATE_RECEPTOR_STATUS_ORGANIZER_HER2_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_RECEPTOR_STATUS_ORGANIZER_HER2_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RECEPTOR_STATUS_ORGANIZER_HER2_RECEPTOR_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				receptorStatusOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.RECEPTOR_STATUS_ORGANIZER__RECEPTOR_STATUS_ORGANIZER_HER2_RECEPTOR_STATUS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ReceptorStatusOrganizerReceptorStatusOrganizerHER2ReceptorStatus",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										receptorStatusOrganizer, context) }),
						new Object[] { receptorStatusOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEstrogenReceptorStatus(ReceptorStatusOrganizer) <em>Get Estrogen Receptor Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstrogenReceptorStatus(ReceptorStatusOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ESTROGEN_RECEPTOR_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::EstrogenReceptorStatus))->asSequence()->any(true).oclAsType(clondata::EstrogenReceptorStatus)";

	/**
	 * The cached OCL query for the '{@link #getEstrogenReceptorStatus(ReceptorStatusOrganizer) <em>Get Estrogen Receptor Status</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstrogenReceptorStatus(ReceptorStatusOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ESTROGEN_RECEPTOR_STATUS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EstrogenReceptorStatus getEstrogenReceptorStatus(ReceptorStatusOrganizer receptorStatusOrganizer) {

		if (GET_ESTROGEN_RECEPTOR_STATUS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getReceptorStatusOrganizer(),
				CLONDATAPackage.eINSTANCE.getReceptorStatusOrganizer().getEAllOperations().get(68));
			try {
				GET_ESTROGEN_RECEPTOR_STATUS__EOCL_QRY = helper.createQuery(GET_ESTROGEN_RECEPTOR_STATUS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ESTROGEN_RECEPTOR_STATUS__EOCL_QRY);
		return (EstrogenReceptorStatus) query.evaluate(receptorStatusOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProgesteroneReceptorStatus(ReceptorStatusOrganizer) <em>Get Progesterone Receptor Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgesteroneReceptorStatus(ReceptorStatusOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROGESTERONE_RECEPTOR_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::ProgesteroneReceptorStatus))->asSequence()->any(true).oclAsType(clondata::ProgesteroneReceptorStatus)";

	/**
	 * The cached OCL query for the '{@link #getProgesteroneReceptorStatus(ReceptorStatusOrganizer) <em>Get Progesterone Receptor Status</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgesteroneReceptorStatus(ReceptorStatusOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROGESTERONE_RECEPTOR_STATUS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProgesteroneReceptorStatus getProgesteroneReceptorStatus(
			ReceptorStatusOrganizer receptorStatusOrganizer) {

		if (GET_PROGESTERONE_RECEPTOR_STATUS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getReceptorStatusOrganizer(),
				CLONDATAPackage.eINSTANCE.getReceptorStatusOrganizer().getEAllOperations().get(69));
			try {
				GET_PROGESTERONE_RECEPTOR_STATUS__EOCL_QRY = helper.createQuery(
					GET_PROGESTERONE_RECEPTOR_STATUS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROGESTERONE_RECEPTOR_STATUS__EOCL_QRY);
		return (ProgesteroneReceptorStatus) query.evaluate(receptorStatusOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHER2ReceptorStatus(ReceptorStatusOrganizer) <em>Get HER2 Receptor Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHER2ReceptorStatus(ReceptorStatusOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HER2_RECEPTOR_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::HER2ReceptorStatus))->asSequence()->any(true).oclAsType(clondata::HER2ReceptorStatus)";

	/**
	 * The cached OCL query for the '{@link #getHER2ReceptorStatus(ReceptorStatusOrganizer) <em>Get HER2 Receptor Status</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHER2ReceptorStatus(ReceptorStatusOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HER2_RECEPTOR_STATUS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HER2ReceptorStatus getHER2ReceptorStatus(ReceptorStatusOrganizer receptorStatusOrganizer) {

		if (GET_HER2_RECEPTOR_STATUS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getReceptorStatusOrganizer(),
				CLONDATAPackage.eINSTANCE.getReceptorStatusOrganizer().getEAllOperations().get(70));
			try {
				GET_HER2_RECEPTOR_STATUS__EOCL_QRY = helper.createQuery(GET_HER2_RECEPTOR_STATUS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HER2_RECEPTOR_STATUS__EOCL_QRY);
		return (HER2ReceptorStatus) query.evaluate(receptorStatusOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerTemplateId(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.17')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerTemplateId(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(ReceptorStatusOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param receptorStatusOrganizer The receiving '<em><b>Receptor Status Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizerTemplateId(ReceptorStatusOrganizer receptorStatusOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getReceptorStatusOrganizer());
			try {
				VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				receptorStatusOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.RECEPTOR_STATUS_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ReceptorStatusOrganizerResultOrganizerTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										receptorStatusOrganizer, context) }),
						new Object[] { receptorStatusOrganizer }));
			}

			return false;
		}
		return true;
	}

} // ReceptorStatusOrganizerOperations
