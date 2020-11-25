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
 * A representation of the model object '<em><b>Cognitive Status Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getCognitiveStatusResultOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultOrganizerTemplateId ResultOrganizerClassCode ResultOrganizerMoodCode ResultOrganizerId ResultOrganizerCode ResultOrganizerStatusCode ResultOrganizerStatusCodeP ResultOrganizerResultObservation' templateId.root='2.16.840.1.113883.10.20.22.4.75' constraints.validation.warning='CognitiveStatusResultOrganizerCodeCodeSystem' classCode='CLUSTER' moodCode='EVN' statusCode.code='completed' constraints.validation.dependOn.ResultOrganizerStatusCode='ResultOrganizerStatusCodeP'"
 *        annotation="duplicates"
 * @generated
 */
public interface CognitiveStatusResultOrganizer extends ResultOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code.isNullFlavorDefined() or self.code.codeSystem = \'2.16.840.1.113883.6.254\' or self.code.codeSystem = \'2.16.840.1.113883.6.96\''"
	 * @generated
	 */
	boolean validateCognitiveStatusResultOrganizerCodeCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusResultObservation)).oclAsType(consol::CognitiveStatusResultObservation)'"
	 * @generated
	 */
	EList<CognitiveStatusResultObservation> getConsolCognitiveStatusResultObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CognitiveStatusResultOrganizer init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CognitiveStatusResultOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // CognitiveStatusResultOrganizer
