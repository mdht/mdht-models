/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

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
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.MolecularDiagnosticTestingOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.OncotypeDXScore;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Molecular Diagnostic Testing Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.MolecularDiagnosticTestingOrganizer#validateMolecularDiagnosticTestingOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Molecular Diagnostic Testing Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.MolecularDiagnosticTestingOrganizer#validateMolecularDiagnosticTestingOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Molecular Diagnostic Testing Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.MolecularDiagnosticTestingOrganizer#validateMolecularDiagnosticTestingOrganizerOncotypeDXScore(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Molecular Diagnostic Testing Organizer Oncotype DX Score</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.MolecularDiagnosticTestingOrganizer#getOncotypeDXScores() <em>Get Oncotype DX Scores</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.MolecularDiagnosticTestingOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MolecularDiagnosticTestingOrganizerOperations extends ResultOrganizerOperations {
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
	protected MolecularDiagnosticTestingOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMolecularDiagnosticTestingOrganizerCodeP(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Molecular Diagnostic Testing Organizer Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMolecularDiagnosticTestingOrganizerCodeP(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMolecularDiagnosticTestingOrganizerCodeP(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Molecular Diagnostic Testing Organizer Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMolecularDiagnosticTestingOrganizerCodeP(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param molecularDiagnosticTestingOrganizer The receiving '<em><b>Molecular Diagnostic Testing Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMolecularDiagnosticTestingOrganizerCodeP(
			MolecularDiagnosticTestingOrganizer molecularDiagnosticTestingOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getMolecularDiagnosticTestingOrganizer());
			try {
				VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				molecularDiagnosticTestingOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER__MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MolecularDiagnosticTestingOrganizerMolecularDiagnosticTestingOrganizerCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										molecularDiagnosticTestingOrganizer, context) }),
						new Object[] { molecularDiagnosticTestingOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMolecularDiagnosticTestingOrganizerCode(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Molecular Diagnostic Testing Organizer Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMolecularDiagnosticTestingOrganizerCode(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '396927009' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateMolecularDiagnosticTestingOrganizerCode(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Molecular Diagnostic Testing Organizer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMolecularDiagnosticTestingOrganizerCode(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param molecularDiagnosticTestingOrganizer The receiving '<em><b>Molecular Diagnostic Testing Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMolecularDiagnosticTestingOrganizerCode(
			MolecularDiagnosticTestingOrganizer molecularDiagnosticTestingOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getMolecularDiagnosticTestingOrganizer());
			try {
				VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				molecularDiagnosticTestingOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER__MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MolecularDiagnosticTestingOrganizerMolecularDiagnosticTestingOrganizerCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										molecularDiagnosticTestingOrganizer, context) }),
						new Object[] { molecularDiagnosticTestingOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMolecularDiagnosticTestingOrganizerOncotypeDXScore(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Molecular Diagnostic Testing Organizer Oncotype DX Score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMolecularDiagnosticTestingOrganizerOncotypeDXScore(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_ONCOTYPE_DX_SCORE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(clondata::OncotypeDXScore))";

	/**
	 * The cached OCL invariant for the '{@link #validateMolecularDiagnosticTestingOrganizerOncotypeDXScore(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Molecular Diagnostic Testing Organizer Oncotype DX Score</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMolecularDiagnosticTestingOrganizerOncotypeDXScore(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_ONCOTYPE_DX_SCORE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param molecularDiagnosticTestingOrganizer The receiving '<em><b>Molecular Diagnostic Testing Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMolecularDiagnosticTestingOrganizerOncotypeDXScore(
			MolecularDiagnosticTestingOrganizer molecularDiagnosticTestingOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_ONCOTYPE_DX_SCORE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getMolecularDiagnosticTestingOrganizer());
			try {
				VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_ONCOTYPE_DX_SCORE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_ONCOTYPE_DX_SCORE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_ONCOTYPE_DX_SCORE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				molecularDiagnosticTestingOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER__MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_ONCOTYPE_DX_SCORE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MolecularDiagnosticTestingOrganizerMolecularDiagnosticTestingOrganizerOncotypeDXScore",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										molecularDiagnosticTestingOrganizer, context) }),
						new Object[] { molecularDiagnosticTestingOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getOncotypeDXScores(MolecularDiagnosticTestingOrganizer) <em>Get Oncotype DX Scores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOncotypeDXScores(MolecularDiagnosticTestingOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ONCOTYPE_DX_SCORES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::OncotypeDXScore)).oclAsType(clondata::OncotypeDXScore)";

	/**
	 * The cached OCL query for the '{@link #getOncotypeDXScores(MolecularDiagnosticTestingOrganizer) <em>Get Oncotype DX Scores</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOncotypeDXScores(MolecularDiagnosticTestingOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ONCOTYPE_DX_SCORES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<OncotypeDXScore> getOncotypeDXScores(
			MolecularDiagnosticTestingOrganizer molecularDiagnosticTestingOrganizer) {

		if (GET_ONCOTYPE_DX_SCORES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getMolecularDiagnosticTestingOrganizer(),
				CLONDATAPackage.eINSTANCE.getMolecularDiagnosticTestingOrganizer().getEAllOperations().get(66));
			try {
				GET_ONCOTYPE_DX_SCORES__EOCL_QRY = helper.createQuery(GET_ONCOTYPE_DX_SCORES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ONCOTYPE_DX_SCORES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<OncotypeDXScore> result = (Collection<OncotypeDXScore>) query.evaluate(
			molecularDiagnosticTestingOrganizer);
		return new BasicEList.UnmodifiableEList<OncotypeDXScore>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerTemplateId(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.49')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerTemplateId(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(MolecularDiagnosticTestingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param molecularDiagnosticTestingOrganizer The receiving '<em><b>Molecular Diagnostic Testing Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizerTemplateId(
			MolecularDiagnosticTestingOrganizer molecularDiagnosticTestingOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getMolecularDiagnosticTestingOrganizer());
			try {
				VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				molecularDiagnosticTestingOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MolecularDiagnosticTestingOrganizerResultOrganizerTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										molecularDiagnosticTestingOrganizer, context) }),
						new Object[] { molecularDiagnosticTestingOrganizer }));
			}

			return false;
		}
		return true;
	}

} // MolecularDiagnosticTestingOrganizerOperations
