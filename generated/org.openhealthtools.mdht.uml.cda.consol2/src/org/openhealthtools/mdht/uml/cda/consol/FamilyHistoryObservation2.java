/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family History Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getFamilyHistoryObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='FamilyHistoryObservation2TemplateId FamilyHistoryObservationCodeP FamilyHistoryObservation2CDTranslationP' templateId.root='2.16.840.1.113883.10.20.22.4.46' templateId.extension='2015-08-01' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.warning='FamilyHistoryObservationCode FamilyHistoryObservation2CDTranslation' constraints.validation.dependOn.FamilyHistoryObservationCode='FamilyHistoryObservationCodeP' constraints.validation.query='FamilyHistoryObservation2CDTranslation FamilyHistoryObservation2CDTranslationP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFamilyHistoryObservation2CD translation.codeSystem='2.16.840.1.113883.6.1' translation.codeSystemName='LOINC' constraints.validation.warning='FamilyHistoryObservation2CDTranslation' constraints.validation.error='FamilyHistoryObservation2CDTranslationP'"
 *        annotation="duplicates"
 * @generated
 */
public interface FamilyHistoryObservation2 extends FamilyHistoryObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.46\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateFamilyHistoryObservation2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((translation-&gt;isEmpty() or translation-&gt;exists(element | element.isNullFlavorUndefined())) implies (not translation-&gt;isEmpty() and translation-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'75326-9\' or value.code = \'75325-1\' or value.code = \'75324-4\' or value.code = \'75323-6\' or value.code = \'29308-4\' or value.code = \'75322-8\' or value.code = \'75275-8\' or value.code = \'75321-0\' or value.code = \'75319-4\' or value.code = \'75318-6\' or value.code = \'75317-8\' or value.code = \'75316-0\' or value.code = \'75315-2\' or value.code = \'75314-5\' or value.code = \'75313-7\' or value.code = \'75312-9\'))) )))'"
	 * @generated
	 */
	boolean validateFamilyHistoryObservation2CDTranslation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((translation-&gt;isEmpty() or translation-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not translation-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateFamilyHistoryObservation2CDTranslationP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryObservation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FamilyHistoryObservation2
