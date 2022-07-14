/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProblemSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProblemSectionEntriesOptionalTemplateId ProblemSectionEntriesOptionalCode ProblemSectionEntriesOptionalCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.5' templateId.extension='2015-08-01' constraints.validation.dependOn.ProblemSectionEntriesOptionalCode='ProblemSectionEntriesOptionalCodeP' constraints.validation.warning='ProblemSectionEntriesOptionalProblemConcern' constraints.validation.info='ProblemSectionEntriesOptional2HealthStatusObservation2'"
 *        annotation="duplicates"
 * @generated
 */
public interface ProblemSectionEntriesOptional2 extends ProblemSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::HealthStatusObservation2))'"
	 * @generated
	 */
	boolean validateProblemSectionEntriesOptional2HealthStatusObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProblemConcernAct2)).oclAsType(consol::ProblemConcernAct2)'"
	 * @generated
	 */
	EList<ProblemConcernAct2> getConsolProblemConcernAct2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HealthStatusObservation2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::HealthStatusObservation2)'"
	 * @generated
	 */
	HealthStatusObservation2 getHealthStatusObservation2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSectionEntriesOptional2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProblemSectionEntriesOptional2
