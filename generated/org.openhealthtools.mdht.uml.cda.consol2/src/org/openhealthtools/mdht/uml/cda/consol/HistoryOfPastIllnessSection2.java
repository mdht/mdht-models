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
 * A representation of the model object '<em><b>History Of Past Illness Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getHistoryOfPastIllnessSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HistoryOfPastIllnessSection2TemplateId HistoryOfPastIllnessSectionCode HistoryOfPastIllnessSectionCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.20' templateId.extension='2015-08-01' constraints.validation.dependOn.HistoryOfPastIllnessSectionCode='HistoryOfPastIllnessSectionCodeP' constraints.validation.info='HistoryOfPastIllnessSectionProblemObservation'"
 *        annotation="duplicates"
 * @generated
 */
public interface HistoryOfPastIllnessSection2 extends HistoryOfPastIllnessSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.20\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHistoryOfPastIllnessSection2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)).oclAsType(consol::ProblemObservation2)'"
	 * @generated
	 */
	EList<ProblemObservation2> getConsolProblemObservation2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HistoryOfPastIllnessSection2
