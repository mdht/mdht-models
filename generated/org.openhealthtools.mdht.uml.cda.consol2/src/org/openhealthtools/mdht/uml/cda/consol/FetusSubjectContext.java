/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.RelatedSubject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fetus Subject Context</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getFetusSubjectContext()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='FetusSubjectContextTemplateId FetusSubjectContextCode FetusSubjectContextSubject' templateId.root='2.16.840.1.113883.10.20.6.2.3' code.code='121026' code.codeSystem='1.2.840.10008.2.16.4' code.codeSystemName='DCM'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFetusSubjectContextSubjectPerson constraints.validation.error='FetusSubjectContextSubjectPersonName'"
 * @generated
 */
public interface FetusSubjectContext extends RelatedSubject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.6.2.3\')'"
	 * @generated
	 */
	boolean validateFetusSubjectContextTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'121026\' and value.codeSystem = \'1.2.840.10008.2.16.4\')'"
	 * @generated
	 */
	boolean validateFetusSubjectContextCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject-&gt;one(subject : cda::SubjectPerson | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::SubjectPerson))'"
	 * @generated
	 */
	boolean validateFetusSubjectContextSubject(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetusSubjectContext init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetusSubjectContext init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FetusSubjectContext
