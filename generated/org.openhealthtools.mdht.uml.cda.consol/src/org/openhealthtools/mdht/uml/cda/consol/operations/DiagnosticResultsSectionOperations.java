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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.ExternalReference;
import org.openhealthtools.mdht.uml.cda.consol.Result;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic Results Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection#validateDiagnosticResultsSectionResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection#validateDiagnosticResultsSectionExternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection#getResultOrganizers() <em>Get Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection#getExternalReferences() <em>Get External References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection#getResults() <em>Get Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection#validateDiagnosticResultsNarrativeSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Narrative Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagnosticResultsSectionOperations extends DiagnosticResultsNarrativeSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticResultsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticResultsSectionResultOrganizer(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionResultOrganizer(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::ResultOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticResultsSectionResultOrganizer(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionResultOrganizer(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::ResultOrganizer))
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDiagnosticResultsSectionResultOrganizer(DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_RESULTS_SECTION);
			try {
				VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER,
						 ConsolPlugin.INSTANCE.getString("DiagnosticResultsSectionResultOrganizer"),
						 new Object [] { diagnosticResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticResultsSectionExternalReference(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionExternalReference(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ExternalReference))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticResultsSectionExternalReference(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section External Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionExternalReference(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ExternalReference))
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDiagnosticResultsSectionExternalReference(DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_RESULTS_SECTION);
			try {
				VALIDATE_DIAGNOSTIC_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_EXTERNAL_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("DiagnosticResultsSectionExternalReference"),
						 new Object [] { diagnosticResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultOrganizers(DiagnosticResultsSection) <em>Get Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOrganizers(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::ResultOrganizer)).oclAsType(consol::ResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getResultOrganizers(DiagnosticResultsSection) <em>Get Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOrganizers(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULT_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::ResultOrganizer)).oclAsType(consol::ResultOrganizer)
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<ResultOrganizer> getResultOrganizers(DiagnosticResultsSection diagnosticResultsSection) {
		if (GET_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.DIAGNOSTIC_RESULTS_SECTION, ConsolPackage.Literals.DIAGNOSTIC_RESULTS_SECTION.getEAllOperations().get(59));
			try {
				GET_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_RESULT_ORGANIZERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ResultOrganizer> result = (Collection<ResultOrganizer>) query.evaluate(diagnosticResultsSection);
		return new BasicEList.UnmodifiableEList<ResultOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getExternalReferences(DiagnosticResultsSection) <em>Get External References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXTERNAL_REFERENCES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ExternalReference)).oclAsType(consol::ExternalReference)";

	/**
	 * The cached OCL query for the '{@link #getExternalReferences(DiagnosticResultsSection) <em>Get External References</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXTERNAL_REFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ExternalReference)).oclAsType(consol::ExternalReference)
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<ExternalReference> getExternalReferences(DiagnosticResultsSection diagnosticResultsSection) {
		if (GET_EXTERNAL_REFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.DIAGNOSTIC_RESULTS_SECTION, ConsolPackage.Literals.DIAGNOSTIC_RESULTS_SECTION.getEAllOperations().get(60));
			try {
				GET_EXTERNAL_REFERENCES__EOCL_QRY = helper.createQuery(GET_EXTERNAL_REFERENCES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EXTERNAL_REFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ExternalReference> result = (Collection<ExternalReference>) query.evaluate(diagnosticResultsSection);
		return new BasicEList.UnmodifiableEList<ExternalReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getResults(DiagnosticResultsSection) <em>Get Results</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Result)).oclAsType(consol::Result)";

	/**
	 * The cached OCL query for the '{@link #getResults(DiagnosticResultsSection) <em>Get Results</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Result)).oclAsType(consol::Result)
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Result> getResults(DiagnosticResultsSection diagnosticResultsSection) {
		if (GET_RESULTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.DIAGNOSTIC_RESULTS_SECTION, ConsolPackage.Literals.DIAGNOSTIC_RESULTS_SECTION.getEAllOperations().get(61));
			try {
				GET_RESULTS__EOCL_QRY = helper.createQuery(GET_RESULTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Result> result = (Collection<Result>) query.evaluate(diagnosticResultsSection);
		return new BasicEList.UnmodifiableEList<Result>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticResultsNarrativeSectionTemplateId(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Narrative Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsNarrativeSectionTemplateId(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.2.3.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticResultsNarrativeSectionTemplateId(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Narrative Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsNarrativeSectionTemplateId(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.2.3.1')
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDiagnosticResultsNarrativeSectionTemplateId(DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_RESULTS_SECTION);
			try {
				VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DiagnosticResultsNarrativeSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(diagnosticResultsSection, context) }),
						 new Object [] { diagnosticResultsSection }));
			}
			return false;
		}
		return true;
	}

} // DiagnosticResultsSectionOperations