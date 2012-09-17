package org.openhealthtools.mdht.uml.cda.mu2consol.operations;


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
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection#validateMu2consolFunctionalStatusSectionCognitiveStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Functional Status Section Cognitive Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection#validateMu2consolFunctionalStatusSectionFunctionalStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Functional Status Section Functional Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection#getMu2consolCognitiveStatusProblemObservations() <em>Get Mu2consol Cognitive Status Problem Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection#getMu2consolCognitiveStatusResultObservations() <em>Get Mu2consol Cognitive Status Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection#getMu2consolCognitiveStatusResultOrganizers() <em>Get Mu2consol Cognitive Status Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection#getMu2consolFunctionalStatusProblemObservations() <em>Get Mu2consol Functional Status Problem Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection#getMu2consolFunctionalStatusResultObservations() <em>Get Mu2consol Functional Status Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection#getMu2consolFunctionalStatusResultOrganizers() <em>Get Mu2consol Functional Status Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection#validateFunctionalStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusSectionOperations extends org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalStatusSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMu2consolFunctionalStatusSectionCognitiveStatus(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Functional Status Section Cognitive Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMu2consolFunctionalStatusSectionCognitiveStatus(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CognitiveStatusProblemObservation)) or self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CognitiveStatusResultObservation)) or  self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateMu2consolFunctionalStatusSectionCognitiveStatus(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Functional Status Section Cognitive Status</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMu2consolFunctionalStatusSectionCognitiveStatus(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CognitiveStatusProblemObservation)) or self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CognitiveStatusResultObservation)) or  self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMu2consolFunctionalStatusSectionCognitiveStatus(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_MU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.FUNCTIONAL_STATUS_SECTION__MU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS,
						 Mu2consolPlugin.INSTANCE.getString("Mu2consolFunctionalStatusSectionCognitiveStatus"),
						 new Object [] { functionalStatusSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMu2consolFunctionalStatusSectionFunctionalStatus(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Functional Status Section Functional Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMu2consolFunctionalStatusSectionFunctionalStatus(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusProblemObservation)) or self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusResultObservation)) or self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::FunctionalStatusResultOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateMu2consolFunctionalStatusSectionFunctionalStatus(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Functional Status Section Functional Status</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMu2consolFunctionalStatusSectionFunctionalStatus(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusProblemObservation)) or self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusResultObservation)) or self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::FunctionalStatusResultOrganizer))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMu2consolFunctionalStatusSectionFunctionalStatus(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_MU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.FUNCTIONAL_STATUS_SECTION__MU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS,
						 Mu2consolPlugin.INSTANCE.getString("Mu2consolFunctionalStatusSectionFunctionalStatus"),
						 new Object [] { functionalStatusSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMu2consolCognitiveStatusProblemObservations(FunctionalStatusSection) <em>Get Mu2consol Cognitive Status Problem Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolCognitiveStatusProblemObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusProblemObservation)).oclAsType(consol::CognitiveStatusProblemObservation)";

	/**
	 * The cached OCL query for the '{@link #getMu2consolCognitiveStatusProblemObservations(FunctionalStatusSection) <em>Get Mu2consol Cognitive Status Problem Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolCognitiveStatusProblemObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusProblemObservation)).oclAsType(consol::CognitiveStatusProblemObservation)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<CognitiveStatusProblemObservation> getMu2consolCognitiveStatusProblemObservations(FunctionalStatusSection functionalStatusSection) {
		if (GET_MU2CONSOL_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION, Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(85));
			try {
				GET_MU2CONSOL_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_MU2CONSOL_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MU2CONSOL_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CognitiveStatusProblemObservation> result = (Collection<CognitiveStatusProblemObservation>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<CognitiveStatusProblemObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMu2consolCognitiveStatusResultObservations(FunctionalStatusSection) <em>Get Mu2consol Cognitive Status Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolCognitiveStatusResultObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusResultObservation)).oclAsType(consol::CognitiveStatusResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getMu2consolCognitiveStatusResultObservations(FunctionalStatusSection) <em>Get Mu2consol Cognitive Status Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolCognitiveStatusResultObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusResultObservation)).oclAsType(consol::CognitiveStatusResultObservation)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<CognitiveStatusResultObservation> getMu2consolCognitiveStatusResultObservations(FunctionalStatusSection functionalStatusSection) {
		if (GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION, Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(86));
			try {
				GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CognitiveStatusResultObservation> result = (Collection<CognitiveStatusResultObservation>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<CognitiveStatusResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMu2consolCognitiveStatusResultOrganizers(FunctionalStatusSection) <em>Get Mu2consol Cognitive Status Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolCognitiveStatusResultOrganizers(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer)).oclAsType(consol::CognitiveStatusResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getMu2consolCognitiveStatusResultOrganizers(FunctionalStatusSection) <em>Get Mu2consol Cognitive Status Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolCognitiveStatusResultOrganizers(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer)).oclAsType(consol::CognitiveStatusResultOrganizer)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<CognitiveStatusResultOrganizer> getMu2consolCognitiveStatusResultOrganizers(FunctionalStatusSection functionalStatusSection) {
		if (GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION, Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(87));
			try {
				GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CognitiveStatusResultOrganizer> result = (Collection<CognitiveStatusResultOrganizer>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<CognitiveStatusResultOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMu2consolFunctionalStatusProblemObservations(FunctionalStatusSection) <em>Get Mu2consol Functional Status Problem Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolFunctionalStatusProblemObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusProblemObservation)).oclAsType(consol::FunctionalStatusProblemObservation)";

	/**
	 * The cached OCL query for the '{@link #getMu2consolFunctionalStatusProblemObservations(FunctionalStatusSection) <em>Get Mu2consol Functional Status Problem Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolFunctionalStatusProblemObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusProblemObservation)).oclAsType(consol::FunctionalStatusProblemObservation)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<FunctionalStatusProblemObservation> getMu2consolFunctionalStatusProblemObservations(FunctionalStatusSection functionalStatusSection) {
		if (GET_MU2CONSOL_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION, Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(88));
			try {
				GET_MU2CONSOL_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_MU2CONSOL_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MU2CONSOL_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FunctionalStatusProblemObservation> result = (Collection<FunctionalStatusProblemObservation>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<FunctionalStatusProblemObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMu2consolFunctionalStatusResultObservations(FunctionalStatusSection) <em>Get Mu2consol Functional Status Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolFunctionalStatusResultObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusResultObservation)).oclAsType(consol::FunctionalStatusResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getMu2consolFunctionalStatusResultObservations(FunctionalStatusSection) <em>Get Mu2consol Functional Status Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolFunctionalStatusResultObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusResultObservation)).oclAsType(consol::FunctionalStatusResultObservation)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<FunctionalStatusResultObservation> getMu2consolFunctionalStatusResultObservations(FunctionalStatusSection functionalStatusSection) {
		if (GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION, Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(89));
			try {
				GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FunctionalStatusResultObservation> result = (Collection<FunctionalStatusResultObservation>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<FunctionalStatusResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMu2consolFunctionalStatusResultOrganizers(FunctionalStatusSection) <em>Get Mu2consol Functional Status Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolFunctionalStatusResultOrganizers(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FunctionalStatusResultOrganizer)).oclAsType(consol::FunctionalStatusResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getMu2consolFunctionalStatusResultOrganizers(FunctionalStatusSection) <em>Get Mu2consol Functional Status Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolFunctionalStatusResultOrganizers(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_ORGANIZERS__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FunctionalStatusResultOrganizer)).oclAsType(consol::FunctionalStatusResultOrganizer)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<FunctionalStatusResultOrganizer> getMu2consolFunctionalStatusResultOrganizers(FunctionalStatusSection functionalStatusSection) {
		if (GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION, Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(90));
			try {
				GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_ORGANIZERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FunctionalStatusResultOrganizer> result = (Collection<FunctionalStatusResultOrganizer>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<FunctionalStatusResultOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionTemplateId(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionTemplateId(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionTemplateId(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionTemplateId(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.14')
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFunctionalStatusSectionTemplateId(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FunctionalStatusSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(functionalStatusSection, context) }),
						 new Object [] { functionalStatusSection }));
			}
			 
			return false;
		}
		return true;
	}

} // FunctionalStatusSectionOperations